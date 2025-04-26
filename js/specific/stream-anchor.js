const streamAcchorMapping = new Map();

streamAcchorMapping.set(
	"stream-exception-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/stream/exception/IStreamExceptionHandler.html"
);
streamAcchorMapping.set(
	"stream-index-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/stream/index/IStreamIndexHandler.html"
);
streamAcchorMapping.set(
	"stream-handler",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/handler/stream/core/IStreamHandler.html"
);
streamAcchorMapping.set(
	"stream-utils",
	"https://javadoc.io/doc/io.github.rajparsaniya/utility-core/latest/utility.core/io/github/rajparsaniya/utils/StreamUtils.html"
);

const streamAnchorEvent = new Event("StreamAnchorLoaded");
window.addEventListener("StreamContentLoaded", function () {
	loadAnchor(streamAcchorMapping, streamAnchorEvent);
});
