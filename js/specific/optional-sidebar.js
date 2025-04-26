const optionalMenu = new Array();

optionalMenu.push({ id: "01", name: "Optional.ifPresent()", path: "optional-if-present" });
optionalMenu.push({ id: "02", name: "Optional.filter()", path: "optional-filter" });
optionalMenu.push({ id: "03", name: "Optional.map()", path: "optional-map" });
optionalMenu.push({ id: "04", name: "Optional.flatMap()", path: "optional-flat-map" });
optionalMenu.push({ id: "05", name: "Optional.or()", path: "optional-or" });
optionalMenu.push({ id: "06", name: "Optional.orElseGet()", path: "optional-or-else-get" });

loadMenu(document.getElementById("optional-menu"), optionalMenu);
