const streamExceptionHandler = "https://gist.github.com/RajParsaniya/4666e8b5d9c233949a602429f225cf1b.js";
const streamIndexHandler = "https://gist.github.com/RajParsaniya/2153cbc80cb56cef686ea32ef06fb98a.js";
const streamHandler = "https://gist.github.com/RajParsaniya/13036133e222b768a6e0f71da2a909b0.js";

const streamImplMapping = new Map();

streamImplMapping.set("stream-exception-handler-filter", { src: streamExceptionHandler, file: "filter.java" });
streamImplMapping.set("stream-index-handler-filter", { src: streamIndexHandler, file: "filter.java" });
streamImplMapping.set("stream-handler-filter", { src: streamHandler, file: "filter.java" });

streamImplMapping.set("stream-exception-handler-map", { src: streamExceptionHandler, file: "map.java" });
streamImplMapping.set("stream-index-handler-map", { src: streamIndexHandler, file: "map.java" });
streamImplMapping.set("stream-handler-map", { src: streamHandler, file: "map.java" });

streamImplMapping.set("stream-exception-handler-map-to-int", { src: streamExceptionHandler, file: "mapToInt.java" });
streamImplMapping.set("stream-index-handler-map-to-int", { src: streamIndexHandler, file: "mapToInt.java" });
streamImplMapping.set("stream-handler-map-to-int", { src: streamHandler, file: "mapToInt.java" });

streamImplMapping.set("stream-exception-handler-map-to-long", { src: streamExceptionHandler, file: "mapToLong.java" });
streamImplMapping.set("stream-index-handler-map-to-long", { src: streamIndexHandler, file: "mapToLong.java" });
streamImplMapping.set("stream-handler-map-to-long", { src: streamHandler, file: "mapToLong.java" });

streamImplMapping.set("stream-exception-handler-map-to-double", { src: streamExceptionHandler, file: "mapToDouble.java" });
streamImplMapping.set("stream-index-handler-map-to-double", { src: streamIndexHandler, file: "mapToDouble.java" });
streamImplMapping.set("stream-handler-map-to-double", { src: streamHandler, file: "mapToDouble.java" });

streamImplMapping.set("stream-exception-handler-flat-map", { src: streamExceptionHandler, file: "flatMap.java" });
streamImplMapping.set("stream-index-handler-flat-map", { src: streamIndexHandler, file: "flatMap.java" });
streamImplMapping.set("stream-handler-flat-map", { src: streamHandler, file: "flatMap.java" });

streamImplMapping.set("stream-exception-handler-flat-map-to-int", { src: streamExceptionHandler, file: "flatMapToInt.java" });
streamImplMapping.set("stream-index-handler-flat-map-to-int", { src: streamIndexHandler, file: "flatMapToInt.java" });
streamImplMapping.set("stream-handler-flat-map-to-int", { src: streamHandler, file: "flatMapToInt.java" });

streamImplMapping.set("stream-exception-handler-flat-map-to-long", { src: streamExceptionHandler, file: "flatMapToLong.java" });
streamImplMapping.set("stream-index-handler-flat-map-to-long", { src: streamIndexHandler, file: "flatMapToLong.java" });
streamImplMapping.set("stream-handler-flat-map-to-long", { src: streamHandler, file: "flatMapToLong.java" });

streamImplMapping.set("stream-exception-handler-flat-map-to-double", { src: streamExceptionHandler, file: "flatMapToDouble.java" });
streamImplMapping.set("stream-index-handler-flat-map-to-double", { src: streamIndexHandler, file: "flatMapToDouble.java" });
streamImplMapping.set("stream-handler-flat-map-to-double", { src: streamHandler, file: "flatMapToDouble.java" });

streamImplMapping.set("stream-exception-handler-map-multi", { src: streamExceptionHandler, file: "mapMulti.java" });
streamImplMapping.set("stream-index-handler-map-multi", { src: streamIndexHandler, file: "mapMulti.java" });
streamImplMapping.set("stream-handler-map-multi", { src: streamHandler, file: "mapMulti.java" });

streamImplMapping.set("stream-exception-handler-map-multi-to-int", { src: streamExceptionHandler, file: "mapMultiToInt.java" });
streamImplMapping.set("stream-index-handler-map-multi-to-int", { src: streamIndexHandler, file: "mapMultiToInt.java" });
streamImplMapping.set("stream-handler-map-multi-to-int", { src: streamHandler, file: "mapMultiToInt.java" });

streamImplMapping.set("stream-exception-handler-map-multi-to-long", { src: streamExceptionHandler, file: "mapMultiToLong.java" });
streamImplMapping.set("stream-index-handler-map-multi-to-long", { src: streamIndexHandler, file: "mapMultiToLong.java" });
streamImplMapping.set("stream-handler-map-multi-to-long", { src: streamHandler, file: "mapMultiToLong.java" });

streamImplMapping.set("stream-exception-handler-map-multi-to-double", { src: streamExceptionHandler, file: "mapMultiToDouble.java" });
streamImplMapping.set("stream-index-handler-map-multi-to-double", { src: streamIndexHandler, file: "mapMultiToDouble.java" });
streamImplMapping.set("stream-handler-map-multi-to-double", { src: streamHandler, file: "mapMultiToDouble.java" });

streamImplMapping.set("stream-exception-handler-sorted", { src: streamExceptionHandler, file: "sorted.java" });
streamImplMapping.set("stream-index-handler-sorted", { src: streamIndexHandler, file: "sorted.java" });
streamImplMapping.set("stream-handler-sorted", { src: streamHandler, file: "sorted.java" });

streamImplMapping.set("stream-exception-handler-peek", { src: streamExceptionHandler, file: "peek.java" });
streamImplMapping.set("stream-index-handler-peek", { src: streamIndexHandler, file: "peek.java" });
streamImplMapping.set("stream-handler-peek", { src: streamHandler, file: "peek.java" });

streamImplMapping.set("stream-exception-handler-take-while", { src: streamExceptionHandler, file: "takeWhile.java" });
streamImplMapping.set("stream-index-handler-take-while", { src: streamIndexHandler, file: "takeWhile.java" });
streamImplMapping.set("stream-handler-take-while", { src: streamHandler, file: "takeWhile.java" });

streamImplMapping.set("stream-exception-handler-drop-while", { src: streamExceptionHandler, file: "dropWhile.java" });
streamImplMapping.set("stream-index-handler-drop-while", { src: streamIndexHandler, file: "dropWhile.java" });
streamImplMapping.set("stream-handler-drop-while", { src: streamHandler, file: "dropWhile.java" });

streamImplMapping.set("stream-exception-handler-for-each", { src: streamExceptionHandler, file: "forEach.java" });
streamImplMapping.set("stream-index-handler-for-each", { src: streamIndexHandler, file: "forEach.java" });
streamImplMapping.set("stream-handler-for-each", { src: streamHandler, file: "forEach.java" });

streamImplMapping.set("stream-exception-handler-for-each-ordered", { src: streamExceptionHandler, file: "forEachOrdered.java" });
streamImplMapping.set("stream-index-handler-for-each-ordered", { src: streamIndexHandler, file: "forEachOrdered.java" });
streamImplMapping.set("stream-handler-for-each-ordered", { src: streamHandler, file: "forEachOrdered.java" });

streamImplMapping.set("stream-exception-handler-any-match", { src: streamExceptionHandler, file: "anyMatch.java" });
streamImplMapping.set("stream-index-handler-any-match", { src: streamIndexHandler, file: "anyMatch.java" });
streamImplMapping.set("stream-handler-any-match", { src: streamHandler, file: "anyMatch.java" });

streamImplMapping.set("stream-exception-handler-all-match", { src: streamExceptionHandler, file: "allMatch.java" });
streamImplMapping.set("stream-index-handler-all-match", { src: streamIndexHandler, file: "allMatch.java" });
streamImplMapping.set("stream-handler-all-match", { src: streamHandler, file: "allMatch.java" });

streamImplMapping.set("stream-exception-handler-none-match", { src: streamExceptionHandler, file: "noneMatch.java" });
streamImplMapping.set("stream-index-handler-none-match", { src: streamIndexHandler, file: "noneMatch.java" });
streamImplMapping.set("stream-handler-none-match", { src: streamHandler, file: "noneMatch.java" });

const streamImplEvent = new Event("StreamImplLoaded");
window.addEventListener("StreamAnchorLoaded", function () {
	loadImplementation(streamImplMapping, streamImplEvent);
});

window.addEventListener("StreamImplLoaded", function () {
	document.querySelector(".loader").style.display = "none";
	document.querySelector(".sidebar").style.display = "block";
	document.querySelector(".content").style.display = "block";
});
