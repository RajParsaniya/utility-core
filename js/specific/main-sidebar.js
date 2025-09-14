const menu = new Array();

menu.push({ id: 1, name: "Introduction", path: "introduction" });
menu.push({ id: 2, name: "Implementation", path: "implementation" });
menu.push({ id: 3, name: "Installation", path: "installation" });

loadMenu(document.getElementById("menu"), menu);
