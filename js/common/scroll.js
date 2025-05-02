const backToTopButton = document.getElementById("backToTop");

window.addEventListener("scroll", () => {
	if (window.pageYOffset > 300) {
		backToTopButton.style.display = "block";
	} else {
		backToTopButton.style.display = "none";
	}
});

backToTopButton.addEventListener("click", () => {
	window.scrollTo({
		top: 0,
		behavior: "smooth",
	});
});
