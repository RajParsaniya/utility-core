const optionalContentMapping = new Map();

optionalContentMapping.set("optional-if-present", "../../content/optional/if-present.html");
optionalContentMapping.set("optional-filter", "../../content/optional/filter.html");
optionalContentMapping.set("optional-map", "../../content/optional/map.html");
optionalContentMapping.set("optional-flat-map", "../../content/optional/flat-map.html");
optionalContentMapping.set("optional-or", "../../content/optional/or.html");
optionalContentMapping.set("optional-or-else-get", "../../content/optional/or-else-get.html");

const optionalContentEvent = new Event("OptionalContentLoaded");
loadContent(document.getElementById("optional-content"), optionalContentMapping, optionalContentEvent);
