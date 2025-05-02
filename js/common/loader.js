function onLoadContent() {
	setTimeout(() => {
		document.querySelector(".loader").style.display = "none";
		document.querySelector(".sidebar").style.display = "block";
		document.querySelector(".content").style.display = "block";
	}, 500);
}
