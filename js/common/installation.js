function openTab(tabName) {
	let tabContents = document.querySelectorAll(".tab-content");
	let tabButtons = document.querySelectorAll(".tab-button");

	tabContents.forEach((content) => {
		content.style.display = "none";
		content.classList.remove("active");
	});

	tabButtons.forEach((button) => {
		button.classList.remove("active");
	});

	document.getElementById(tabName).style.display = "block";
	document.getElementById(tabName).classList.add("active");
	event.currentTarget.classList.add("active");
}

function setDependency(element, dependency) {
	const id = element.id + "-dependency";

	let html = "";
	html += "<textarea id='" + id + "' readonly>";
	html += dependency;
	html += "</textarea>";

	element.innerHTML = html;
}

function loadDependency(mapping) {
	Array.from(mapping.entries()).reduce((promiseChain, [key, value]) => {
		return promiseChain.then(() => setDependency(document.getElementById(key), value));
	}, Promise.resolve());
}
