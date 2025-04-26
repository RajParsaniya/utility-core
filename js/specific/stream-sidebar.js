const streamMenu = new Array();

streamMenu.push({ id: "01", name: "Stream.filter()", path: "stream-filter" });
streamMenu.push({ id: "02", name: "Stream.map()", path: "stream-map" });
streamMenu.push({ id: "03", name: "Stream.mapToInt()", path: "stream-map-to-int" });
streamMenu.push({ id: "04", name: "Stream.mapToLong()", path: "stream-map-to-long" });
streamMenu.push({ id: "05", name: "Stream.mapToDouble()", path: "stream-map-to-double" });
streamMenu.push({ id: "06", name: "Stream.flatMap()", path: "stream-flat-map" });
streamMenu.push({ id: "07", name: "Stream.flatMapToInt()", path: "stream-flat-map-to-int" });
streamMenu.push({ id: "08", name: "Stream.flatMapToLong()", path: "stream-flat-map-to-long" });
streamMenu.push({ id: "09", name: "Stream.flatMapToDouble()", path: "stream-flat-map-to-double" });
streamMenu.push({ id: "10", name: "Stream.mapMulti()", path: "stream-map-multi" });
streamMenu.push({ id: "11", name: "Stream.mapMultiToInt()", path: "stream-map-multi-to-int" });
streamMenu.push({ id: "12", name: "Stream.mapMultiToLong()", path: "stream-map-multi-to-long" });
streamMenu.push({ id: "13", name: "Stream.mapMultiToDouble()", path: "stream-map-multi-to-double" });
streamMenu.push({ id: "14", name: "Stream.sorted()", path: "stream-sorted" });
streamMenu.push({ id: "15", name: "Stream.peek()", path: "stream-peek" });
streamMenu.push({ id: "16", name: "Stream.takeWhile()", path: "stream-take-while" });
streamMenu.push({ id: "17", name: "Stream.dropWhile()", path: "stream-drop-while" });
streamMenu.push({ id: "18", name: "Stream.forEach()", path: "stream-for-each" });
streamMenu.push({ id: "19", name: "Stream.forEachOrdered()", path: "stream-for-each-ordered" });
streamMenu.push({ id: "20", name: "Stream.anyMatch()", path: "stream-any-match" });
streamMenu.push({ id: "21", name: "Stream.allMatch()", path: "stream-all-match" });
streamMenu.push({ id: "22", name: "Stream.noneMatch()", path: "stream-none-match" });

loadMenu(document.getElementById("stream-menu"), streamMenu);
