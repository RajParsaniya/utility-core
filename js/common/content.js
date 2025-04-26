function getContent(keys) {
	return Array.from(keys).reduce((accumulator, id) => {
		return accumulator + "<div class = 'section' id='" + id + "'></div>";
	}, "");
}

function setContent(key, data) {
	return new Promise((resolve) => {
		const containers = document.getElementById(key);
		containers.innerHTML = data;
		setTimeout(resolve, 100);
	});
}

function setAccordionTransition(element) {
	return new Promise((resolve) => {
		const accordionHeaders = element.querySelectorAll(".accordion-header");
		accordionHeaders.forEach((header) => {
			header.addEventListener("click", () => {
				const content = header.nextElementSibling;
				const isActive = header.classList.contains("active");

				accordionHeaders.forEach((otherHeader) => {
					const otherContent = otherHeader.nextElementSibling;
					if (otherHeader !== header) {
						otherHeader.classList.remove("active");
						otherContent.style.maxHeight = null;
						otherContent.classList.remove("show");
					}
				});

				if (!isActive) {
					header.classList.add("active");
					content.classList.add("show");
					content.style.maxHeight = content.scrollHeight + "px";
				} else {
					header.classList.remove("active");
					content.style.maxHeight = null;
					content.classList.remove("show");
				}
			});
		});
		setTimeout(resolve, 100);
	});
}

function setContentEvent(event) {
	return new Promise((resolve) => {
		window.dispatchEvent(event);
		setTimeout(resolve, 100);
	});
}

function loadContent(element, mapping, event) {
	element.innerHTML = getContent(mapping.keys());

	Array.from(mapping.entries())
		.reduce((promiseChain, [key, value]) => {
			return promiseChain.then(() =>
				fetch(value)
					.then((response) => response.text())
					.then((data) => setContent(key, data))
			);
		}, Promise.resolve())
		.then(() => setAccordionTransition(element))
		.then(() => setContentEvent(event));
}
