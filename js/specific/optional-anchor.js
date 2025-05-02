const optionalAcchorMapping = new Map();

optionalAcchorMapping.set(
	"optional-exception-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/optional/exception/IOptionalExceptionHandler.html"
);
optionalAcchorMapping.set(
	"optional-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/optional/core/IOptionalHandler.html"
);
optionalAcchorMapping.set(
	"optional-utils",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/utils/OptionalUtils.html"
);

const optionalAnchorEvent = new Event("OptionalAnchorLoaded");
window.addEventListener("OptionalContentLoaded", function () {
	loadAnchor(optionalAcchorMapping, optionalAnchorEvent);
});
