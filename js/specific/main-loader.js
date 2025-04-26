window.addEventListener("DOMContentLoaded", function () {
	setTimeout(() => {
		document.querySelector(".loader").style.display = "none";
		document.querySelector(".sidebar").style.display = "block";
		document.querySelector(".content").style.display = "block";
	}, 1000);
});

window.addEventListener("pageshow", function () {
	setTimeout(() => {
		document.querySelector(".loader").style.display = "none";
		document.querySelector(".sidebar").style.display = "block";
		document.querySelector(".content").style.display = "block";
	}, 1000);
});
