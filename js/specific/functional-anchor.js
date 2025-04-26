const functionalAcchorMapping = new Map();

functionalAcchorMapping.set(
	"functional-exception-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/functional/exception/IFunctionalExceptionHandler.html"
);
functionalAcchorMapping.set(
	"functional-index-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/functional/index/IFunctionalIndexHandler.html"
);
functionalAcchorMapping.set(
	"functional-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/functional/core/IFunctionalHandler.html"
);
functionalAcchorMapping.set(
	"functional-utils",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/utils/FunctionalUtils.html"
);

const functionalAnchorEvent = new Event("FunctionalAnchorLoaded");
window.addEventListener("FunctionalContentLoaded", function () {
	loadAnchor(functionalAcchorMapping, functionalAnchorEvent);
});
