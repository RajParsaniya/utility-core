const optionalExceptionHandler = "https://gist.github.com/RajParsaniya/dfe70b4b275076380e9d6f4dc223baf1.js";
const optionalHandler = "https://gist.github.com/RajParsaniya/2bf11f71493bc43a05394b8309b1d896.js";

const optionalImplMapping = new Map();

optionalImplMapping.set("optional-exception-handler-if-present", { src: optionalExceptionHandler, file: "ifPresent.java" });
optionalImplMapping.set("optional-handler-if-present", { src: optionalHandler, file: "ifPresent.java" });

optionalImplMapping.set("optional-exception-handler-filter", { src: optionalExceptionHandler, file: "filter.java" });
optionalImplMapping.set("optional-handler-filter", { src: optionalHandler, file: "filter.java" });

optionalImplMapping.set("optional-exception-handler-map", { src: optionalExceptionHandler, file: "map.java" });
optionalImplMapping.set("optional-handler-map", { src: optionalHandler, file: "map.java" });

optionalImplMapping.set("optional-exception-handler-flat-map", { src: optionalExceptionHandler, file: "flatMap.java" });
optionalImplMapping.set("optional-handler-flat-map", { src: optionalHandler, file: "flatMap.java" });

optionalImplMapping.set("optional-exception-handler-or", { src: optionalExceptionHandler, file: "or.java" });
optionalImplMapping.set("optional-handler-or", { src: optionalHandler, file: "or.java" });

optionalImplMapping.set("optional-exception-handler-or-else-get", { src: optionalExceptionHandler, file: "orElseGet.java" });
optionalImplMapping.set("optional-handler-or-else-get", { src: optionalHandler, file: "orElseGet.java" });

const optionalImplEvent = new Event("OptionalImplLoaded");
window.addEventListener("OptionalAnchorLoaded", function () {
	loadImplementation(optionalImplMapping, optionalImplEvent);
});

window.addEventListener("OptionalImplLoaded", function () {
	document.querySelector(".loader").style.display = "none";
	document.querySelector(".sidebar").style.display = "block";
	document.querySelector(".content").style.display = "block";
});
