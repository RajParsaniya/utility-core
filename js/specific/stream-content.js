const streamContentMapping = new Map();

streamContentMapping.set("stream-filter", "../../content/stream/filter.html");
streamContentMapping.set("stream-map", "../../content/stream/map.html");
streamContentMapping.set("stream-map-to-int", "../../content/stream/map-to-int.html");
streamContentMapping.set("stream-map-to-long", "../../content/stream/map-to-long.html");
streamContentMapping.set("stream-map-to-double", "../../content/stream/map-to-double.html");
streamContentMapping.set("stream-flat-map", "../../content/stream/flat-map.html");
streamContentMapping.set("stream-flat-map-to-int", "../../content/stream/flat-map-to-int.html");
streamContentMapping.set("stream-flat-map-to-long", "../../content/stream/flat-map-to-long.html");
streamContentMapping.set("stream-flat-map-to-double", "../../content/stream/flat-map-to-double.html");
streamContentMapping.set("stream-map-multi", "../../content/stream/map-multi.html");
streamContentMapping.set("stream-map-multi-to-int", "../../content/stream/map-multi-to-int.html");
streamContentMapping.set("stream-map-multi-to-long", "../../content/stream/map-multi-to-long.html");
streamContentMapping.set("stream-map-multi-to-double", "../../content/stream/map-multi-to-double.html");
streamContentMapping.set("stream-sorted", "../../content/stream/sorted.html");
streamContentMapping.set("stream-peek", "../../content/stream/peek.html");
streamContentMapping.set("stream-take-while", "../../content/stream/take-while.html");
streamContentMapping.set("stream-drop-while", "../../content/stream/drop-while.html");
streamContentMapping.set("stream-for-each", "../../content/stream/for-each.html");
streamContentMapping.set("stream-for-each-ordered", "../../content/stream/for-each-ordered.html");
streamContentMapping.set("stream-any-match", "../../content/stream/any-match.html");
streamContentMapping.set("stream-all-match", "../../content/stream/all-match.html");
streamContentMapping.set("stream-none-match", "../../content/stream/none-match.html");

const streamContentEvent = new Event("StreamContentLoaded");
loadContent(document.getElementById("stream-content"), streamContentMapping, streamContentEvent);
