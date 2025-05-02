function setAnchor(key, anchor) {
	return new Promise((resolve) => {
		const elements = document.querySelectorAll("#" + key);
		elements.forEach((element) => (element.href = anchor));
		setTimeout(resolve, 100);
	});
}

function setAnchorEvent(event) {
	return new Promise((resolve) => {
		window.dispatchEvent(event);
		setTimeout(resolve, 100);
	});
}

function loadAnchor(mapping, event) {
	Array.from(mapping.entries())
		.reduce((promiseChain, [key, value]) => {
			return promiseChain.then(() => setAnchor(key, value));
		}, Promise.resolve())
		.then(() => setContentEvent(event));
}
