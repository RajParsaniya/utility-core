function getMenu(obj) {
	let html = "";
	html += "<div class='link'>";
	html += "   <p>" + obj.id + "</p>";
	html += "   <a href='#" + obj.path + "' data-target='" + obj.path + "'>" + obj.name + "</a>";
	html += "</div>";
	return html;
}

function getSubMenu(obj) {
	let html = "";
	html += "<div class='link'>";
	html += "   <p>" + obj.id + "</p>";
	html += "   <a href='#" + obj.path + "' data-target='" + obj.path + "'>" + obj.name + "</a>";
	html += "</div>";
	return html;
}

function setMenuBreakpoints() {
	const menuLinks = document.querySelectorAll(".sidebar a");
	menuLinks.forEach((link) => {
		const text = link.textContent.replace(/([A-Z])/g, "\u200B$1");
		link.textContent = text;
	});
}

function setMenuTransition() {
	const menuLinks = document.querySelectorAll(".sidebar a");
	menuLinks.forEach((link) => {
		link.addEventListener("click", function (event) {
			event.preventDefault();
			const targetId = this.getAttribute("data-target");
			const targetElement = document.getElementById(targetId);

			if (targetElement) {
				targetElement.scrollIntoView({
					behavior: "smooth",
				});
			}
		});
	});
}

function loadMenu(element, menu) {
	element.innerHTML = menu.reduce((accumulator, object) => {
		let html = getMenu(object);
		html += (object.subMenu ?? []).reduce((acc, obj) => acc + getSubMenu(obj), "");
		return accumulator + html;
	}, "");

	setTimeout(() => {
		setMenuBreakpoints();
		setMenuTransition();
	}, 100);
}
