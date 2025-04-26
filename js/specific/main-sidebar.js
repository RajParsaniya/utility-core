const menu = new Array();

menu.push({ id: 1, name: "Introduction", path: "introduction" });
menu.push({
	id: 2,
	name: "Implementation",
	path: "implementation",
	subMenu: [
		{ id: 2.1, name: "Stream Utility", path: "stream-utility" },
		{ id: 2.2, name: "Optional Utility", path: "optional-utility" },
		{ id: 2.3, name: "Functional Utility", path: "functional-utility" },
	],
});
menu.push({ id: 3, name: "Installation", path: "installation" });

loadMenu(document.getElementById("menu"), menu);
