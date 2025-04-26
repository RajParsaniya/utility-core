function createGithubGistCallback(container) {
	const callback = "callback" + String(Math.floor(Math.random() * 9 * Math.pow(10, 11) + Math.pow(10, 11)));
	window[callback] = function (gist) {
		const isAlreadyLoaded = Array.from(document.head.querySelectorAll("link[rel='stylesheet']")).find((link) => link.href === gist.stylesheet);

		if (!isAlreadyLoaded) {
			const link = document.createElement("link");
			link.href = gist.stylesheet;
			link.rel = "stylesheet";
			document.head.appendChild(link);
		}

		container.innerHTML = gist.div;
		delete window[callback];
	};
	return callback;
}

function setGithubGistScript(container, data) {
	const callback = createGithubGistCallback(container);
	const script = document.createElement("script");
	script.src = data.src + "on?callback=" + callback + "&file=" + data.file;
	container.appendChild(script);
}

function setGithubGistSpinner(element) {
	let html = "";
	html += "<div class='spinner-container'>";
	html += "	<div class='spinner'></div>";
	html += "</div>";
	element.innerHTML = html;
}

function setAccordionEvent(key, value) {
	const element = document.getElementById(key);
	const eleAccordion = element.closest(".accordion");
	const eleAccordionHeader = eleAccordion.querySelector(".accordion-header");
	const eleAccordionContent = eleAccordion.querySelector(".accordion-content");
	const eleGistContainer = eleAccordionContent.querySelector(".gist-container");

	eleAccordionHeader.addEventListener("click", () => {
		const eleGist = eleGistContainer.querySelector(".gist");
		if (element.children.length === 0 || eleGist === null) {
			setGithubGistSpinner(element);
			setGithubGistScript(element, value);
		}
	});
}

function setImplementationEvent(event) {
	return new Promise((resolve) => {
		window.dispatchEvent(event);
		setTimeout(() => resolve, 100);
	});
}

function loadImplementation(mapping, event) {
	Array.from(mapping.entries())
		.reduce((promiseChain, [key, value]) => {
			return promiseChain.then(() => setAccordionEvent(key, value));
		}, Promise.resolve())
		.then(() => setImplementationEvent(event));
}
