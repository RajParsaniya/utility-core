const functionalExceptionHandler = "https://gist.github.com/RajParsaniya/49099c59d5e6bdda197cba3b3888a134.js";
const functionalIndexHandler = "https://gist.github.com/RajParsaniya/d3a916ea565f3f355500d7351e56063c.js";
const functionalHandler = "https://gist.github.com/RajParsaniya/d3a916ea565f3f355500d7351e56063c.js";

const functionalImplMapping = new Map();

functionalImplMapping.set("functional-exception-handler-boolean-supplier", { src: functionalExceptionHandler, file: "booleanSupplier.java" });
functionalImplMapping.set("functional-index-handler-boolean-supplier", { src: functionalIndexHandler, file: "booleanSupplier.java" });
functionalImplMapping.set("functional-handler-boolean-supplier", { src: functionalHandler, file: "booleanSupplier.java" });

functionalImplMapping.set("functional-exception-handler-int-supplier", { src: functionalExceptionHandler, file: "intSupplier.java" });
functionalImplMapping.set("functional-index-handler-int-supplier", { src: functionalIndexHandler, file: "intSupplier.java" });
functionalImplMapping.set("functional-handler-int-supplier", { src: functionalHandler, file: "intSupplier.java" });

functionalImplMapping.set("functional-exception-handler-int-consumer", { src: functionalExceptionHandler, file: "intConsumer.java" });
functionalImplMapping.set("functional-index-handler-int-consumer", { src: functionalIndexHandler, file: "intConsumer.java" });
functionalImplMapping.set("functional-handler-int-consumer", { src: functionalHandler, file: "intConsumer.java" });

functionalImplMapping.set("functional-exception-handler-int-predicate", { src: functionalExceptionHandler, file: "intPredicate.java" });
functionalImplMapping.set("functional-index-handler-int-predicate", { src: functionalIndexHandler, file: "intPredicate.java" });
functionalImplMapping.set("functional-handler-int-predicate", { src: functionalHandler, file: "intPredicate.java" });

functionalImplMapping.set("functional-exception-handler-int-to-long-function", { src: functionalExceptionHandler, file: "intToLongFunction.java" });
functionalImplMapping.set("functional-index-handler-int-to-long-function", { src: functionalIndexHandler, file: "intToLongFunction.java" });
functionalImplMapping.set("functional-handler-int-to-long-function", { src: functionalHandler, file: "intToLongFunction.java" });

functionalImplMapping.set("functional-exception-handler-int-to-double-function", { src: functionalExceptionHandler, file: "intToDoubleFunction.java" });
functionalImplMapping.set("functional-index-handler-int-to-double-function", { src: functionalIndexHandler, file: "intToDoubleFunction.java" });
functionalImplMapping.set("functional-handler-int-to-double-function", { src: functionalHandler, file: "intToDoubleFunction.java" });

functionalImplMapping.set("functional-exception-handler-int-binary-operator", { src: functionalExceptionHandler, file: "intBinaryOperator.java" });
functionalImplMapping.set("functional-index-handler-int-binary-operator", { src: functionalIndexHandler, file: "intBinaryOperator.java" });
functionalImplMapping.set("functional-handler-int-binary-operator", { src: functionalHandler, file: "intBinaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-int-unary-operator", { src: functionalExceptionHandler, file: "intUnaryOperator.java" });
functionalImplMapping.set("functional-index-handler-int-unary-operator", { src: functionalIndexHandler, file: "intUnaryOperator.java" });
functionalImplMapping.set("functional-handler-int-unary-operator", { src: functionalHandler, file: "intUnaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-long-supplier", { src: functionalExceptionHandler, file: "longSupplier.java" });
functionalImplMapping.set("functional-index-handler-long-supplier", { src: functionalIndexHandler, file: "longSupplier.java" });
functionalImplMapping.set("functional-handler-long-supplier", { src: functionalHandler, file: "longSupplier.java" });

functionalImplMapping.set("functional-exception-handler-long-consumer", { src: functionalExceptionHandler, file: "longConsumer.java" });
functionalImplMapping.set("functional-index-handler-long-consumer", { src: functionalIndexHandler, file: "longConsumer.java" });
functionalImplMapping.set("functional-handler-long-consumer", { src: functionalHandler, file: "longConsumer.java" });

functionalImplMapping.set("functional-exception-handler-long-predicate", { src: functionalExceptionHandler, file: "longPredicate.java" });
functionalImplMapping.set("functional-index-handler-long-predicate", { src: functionalIndexHandler, file: "longPredicate.java" });
functionalImplMapping.set("functional-handler-long-predicate", { src: functionalHandler, file: "longPredicate.java" });

functionalImplMapping.set("functional-exception-handler-long-to-int-function", { src: functionalExceptionHandler, file: "longToIntFunction.java" });
functionalImplMapping.set("functional-index-handler-long-to-int-function", { src: functionalIndexHandler, file: "longToIntFunction.java" });
functionalImplMapping.set("functional-handler-long-to-int-function", { src: functionalHandler, file: "longToIntFunction.java" });

functionalImplMapping.set("functional-exception-handler-long-to-double-function", { src: functionalExceptionHandler, file: "longToDoubleFunction.java" });
functionalImplMapping.set("functional-index-handler-long-to-double-function", { src: functionalIndexHandler, file: "longToDoubleFunction.java" });
functionalImplMapping.set("functional-handler-long-to-double-function", { src: functionalHandler, file: "longToDoubleFunction.java" });

functionalImplMapping.set("functional-exception-handler-long-binary-operator", { src: functionalExceptionHandler, file: "longBinaryOperator.java" });
functionalImplMapping.set("functional-index-handler-long-binary-operator", { src: functionalIndexHandler, file: "longBinaryOperator.java" });
functionalImplMapping.set("functional-handler-long-binary-operator", { src: functionalHandler, file: "longBinaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-long-unary-operator", { src: functionalExceptionHandler, file: "longUnaryOperator.java" });
functionalImplMapping.set("functional-index-handler-long-unary-operator", { src: functionalIndexHandler, file: "longUnaryOperator.java" });
functionalImplMapping.set("functional-handler-long-unary-operator", { src: functionalHandler, file: "longUnaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-double-supplier", { src: functionalExceptionHandler, file: "doubleSupplier.java" });
functionalImplMapping.set("functional-index-handler-double-supplier", { src: functionalIndexHandler, file: "doubleSupplier.java" });
functionalImplMapping.set("functional-handler-double-supplier", { src: functionalHandler, file: "doubleSupplier.java" });

functionalImplMapping.set("functional-exception-handler-double-consumer", { src: functionalExceptionHandler, file: "doubleConsumer.java" });
functionalImplMapping.set("functional-index-handler-double-consumer", { src: functionalIndexHandler, file: "doubleConsumer.java" });
functionalImplMapping.set("functional-handler-double-consumer", { src: functionalHandler, file: "doubleConsumer.java" });

functionalImplMapping.set("functional-exception-handler-double-predicate", { src: functionalExceptionHandler, file: "doublePredicate.java" });
functionalImplMapping.set("functional-index-handler-double-predicate", { src: functionalIndexHandler, file: "doublePredicate.java" });
functionalImplMapping.set("functional-handler-double-predicate", { src: functionalHandler, file: "doublePredicate.java" });

functionalImplMapping.set("functional-exception-handler-double-to-int-function", { src: functionalExceptionHandler, file: "doubleToIntFunction.java" });
functionalImplMapping.set("functional-index-handler-double-to-int-function", { src: functionalIndexHandler, file: "doubleToIntFunction.java" });
functionalImplMapping.set("functional-handler-double-to-int-function", { src: functionalHandler, file: "doubleToIntFunction.java" });

functionalImplMapping.set("functional-exception-handler-double-to-long-function", { src: functionalExceptionHandler, file: "doubleToLongFunction.java" });
functionalImplMapping.set("functional-index-handler-double-to-long-function", { src: functionalIndexHandler, file: "doubleToLongFunction.java" });
functionalImplMapping.set("functional-handler-double-to-long-function", { src: functionalHandler, file: "doubleToLongFunction.java" });

functionalImplMapping.set("functional-exception-handler-double-binary-operator", { src: functionalExceptionHandler, file: "doubleBinaryOperator.java" });
functionalImplMapping.set("functional-index-handler-double-binary-operator", { src: functionalIndexHandler, file: "doubleBinaryOperator.java" });
functionalImplMapping.set("functional-handler-double-binary-operator", { src: functionalHandler, file: "doubleBinaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-double-unary-operator", { src: functionalExceptionHandler, file: "doubleUnaryOperator.java" });
functionalImplMapping.set("functional-index-handler-double-unary-operator", { src: functionalIndexHandler, file: "doubleUnaryOperator.java" });
functionalImplMapping.set("functional-handler-double-unary-operator", { src: functionalHandler, file: "doubleUnaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-supplier", { src: functionalExceptionHandler, file: "supplier.java" });
functionalImplMapping.set("functional-index-handler-supplier", { src: functionalIndexHandler, file: "supplier.java" });
functionalImplMapping.set("functional-handler-supplier", { src: functionalHandler, file: "supplier.java" });

functionalImplMapping.set("functional-exception-handler-consumer", { src: functionalExceptionHandler, file: "consumer.java" });
functionalImplMapping.set("functional-index-handler-consumer", { src: functionalIndexHandler, file: "consumer.java" });
functionalImplMapping.set("functional-handler-consumer", { src: functionalHandler, file: "consumer.java" });

functionalImplMapping.set("functional-exception-handler-predicate", { src: functionalExceptionHandler, file: "predicate.java" });
functionalImplMapping.set("functional-index-handler-predicate", { src: functionalIndexHandler, file: "predicate.java" });
functionalImplMapping.set("functional-handler-predicate", { src: functionalHandler, file: "predicate.java" });

functionalImplMapping.set("functional-exception-handler-function", { src: functionalExceptionHandler, file: "function.java" });
functionalImplMapping.set("functional-index-handler-function", { src: functionalIndexHandler, file: "function.java" });
functionalImplMapping.set("functional-handler-function", { src: functionalHandler, file: "function.java" });

functionalImplMapping.set("functional-exception-handler-bi-consumer", { src: functionalExceptionHandler, file: "biConsumer.java" });
functionalImplMapping.set("functional-index-handler-bi-consumer", { src: functionalIndexHandler, file: "biConsumer.java" });
functionalImplMapping.set("functional-handler-bi-consumer", { src: functionalHandler, file: "biConsumer.java" });

functionalImplMapping.set("functional-exception-handler-bi-predicate", { src: functionalExceptionHandler, file: "biPredicate.java" });
functionalImplMapping.set("functional-index-handler-bi-predicate", { src: functionalIndexHandler, file: "biPredicate.java" });
functionalImplMapping.set("functional-handler-bi-predicate", { src: functionalHandler, file: "biPredicate.java" });

functionalImplMapping.set("functional-exception-handler-bi-function", { src: functionalExceptionHandler, file: "biFunction.java" });
functionalImplMapping.set("functional-index-handler-bi-function", { src: functionalIndexHandler, file: "biFunction.java" });
functionalImplMapping.set("functional-handler-bi-function", { src: functionalHandler, file: "biFunction.java" });

functionalImplMapping.set("functional-exception-handler-binary-operator", { src: functionalExceptionHandler, file: "binaryOperator.java" });
functionalImplMapping.set("functional-index-handler-binary-operator", { src: functionalIndexHandler, file: "binaryOperator.java" });
functionalImplMapping.set("functional-handler-binary-operator", { src: functionalHandler, file: "binaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-to-int-function", { src: functionalExceptionHandler, file: "toIntFunction.java" });
functionalImplMapping.set("functional-index-handler-to-int-function", { src: functionalIndexHandler, file: "toIntFunction.java" });
functionalImplMapping.set("functional-handler-to-int-function", { src: functionalHandler, file: "toIntFunction.java" });

functionalImplMapping.set("functional-exception-handler-to-long-function", { src: functionalExceptionHandler, file: "toLongFunction.java" });
functionalImplMapping.set("functional-index-handler-to-long-function", { src: functionalIndexHandler, file: "toLongFunction.java" });
functionalImplMapping.set("functional-handler-to-long-function", { src: functionalHandler, file: "toLongFunction.java" });

functionalImplMapping.set("functional-exception-handler-to-double-function", { src: functionalExceptionHandler, file: "toDoubleFunction.java" });
functionalImplMapping.set("functional-index-handler-to-double-function", { src: functionalIndexHandler, file: "toDoubleFunction.java" });
functionalImplMapping.set("functional-handler-to-double-function", { src: functionalHandler, file: "toDoubleFunction.java" });

functionalImplMapping.set("functional-exception-handler-to-int-bi-function", { src: functionalExceptionHandler, file: "toIntBiFunction.java" });
functionalImplMapping.set("functional-index-handler-to-int-bi-function", { src: functionalIndexHandler, file: "toIntBiFunction.java" });
functionalImplMapping.set("functional-handler-to-int-bi-function", { src: functionalHandler, file: "toIntBiFunction.java" });

functionalImplMapping.set("functional-exception-handler-to-long-bi-function", { src: functionalExceptionHandler, file: "toLongBiFunction.java" });
functionalImplMapping.set("functional-index-handler-to-long-bi-function", { src: functionalIndexHandler, file: "toLongBiFunction.java" });
functionalImplMapping.set("functional-handler-to-long-bi-function", { src: functionalHandler, file: "toLongBiFunction.java" });

functionalImplMapping.set("functional-exception-handler-to-double-bi-function", { src: functionalExceptionHandler, file: "toDoubleBiFunction.java" });
functionalImplMapping.set("functional-index-handler-to-double-bi-function", { src: functionalIndexHandler, file: "toDoubleBiFunction.java" });
functionalImplMapping.set("functional-handler-to-double-bi-function", { src: functionalHandler, file: "toDoubleBiFunction.java" });

functionalImplMapping.set("functional-exception-handler-int-function", { src: functionalExceptionHandler, file: "intFunction.java" });
functionalImplMapping.set("functional-index-handler-int-function", { src: functionalIndexHandler, file: "intFunction.java" });
functionalImplMapping.set("functional-handler-int-function", { src: functionalHandler, file: "intFunction.java" });

functionalImplMapping.set("functional-exception-handler-long-function", { src: functionalExceptionHandler, file: "longFunction.java" });
functionalImplMapping.set("functional-index-handler-long-function", { src: functionalIndexHandler, file: "longFunction.java" });
functionalImplMapping.set("functional-handler-long-function", { src: functionalHandler, file: "longFunction.java" });

functionalImplMapping.set("functional-exception-handler-double-function", { src: functionalExceptionHandler, file: "doubleFunction.java" });
functionalImplMapping.set("functional-index-handler-double-function", { src: functionalIndexHandler, file: "doubleFunction.java" });
functionalImplMapping.set("functional-handler-double-function", { src: functionalHandler, file: "doubleFunction.java" });

functionalImplMapping.set("functional-exception-handler-obj-int-consumer", { src: functionalExceptionHandler, file: "objIntConsumer.java" });
functionalImplMapping.set("functional-index-handler-obj-int-consumer", { src: functionalIndexHandler, file: "objIntConsumer.java" });
functionalImplMapping.set("functional-handler-obj-int-consumer", { src: functionalHandler, file: "objIntConsumer.java" });

functionalImplMapping.set("functional-exception-handler-obj-long-consumer", { src: functionalExceptionHandler, file: "objLongConsumer.java" });
functionalImplMapping.set("functional-index-handler-obj-long-consumer", { src: functionalIndexHandler, file: "objLongConsumer.java" });
functionalImplMapping.set("functional-handler-obj-long-consumer", { src: functionalHandler, file: "objLongConsumer.java" });

functionalImplMapping.set("functional-exception-handler-obj-double-consumer", { src: functionalExceptionHandler, file: "objDoubleConsumer.java" });
functionalImplMapping.set("functional-index-handler-obj-double-consumer", { src: functionalIndexHandler, file: "objDoubleConsumer.java" });
functionalImplMapping.set("functional-handler-obj-double-consumer", { src: functionalHandler, file: "objDoubleConsumer.java" });

functionalImplMapping.set("functional-exception-handler-unary-operator", { src: functionalExceptionHandler, file: "unaryOperator.java" });
functionalImplMapping.set("functional-index-handler-unary-operator", { src: functionalIndexHandler, file: "unaryOperator.java" });
functionalImplMapping.set("functional-handler-unary-operator", { src: functionalHandler, file: "unaryOperator.java" });

functionalImplMapping.set("functional-exception-handler-comparator", { src: functionalExceptionHandler, file: "comparator.java" });
functionalImplMapping.set("functional-index-handler-comparator", { src: functionalIndexHandler, file: "comparator.java" });
functionalImplMapping.set("functional-handler-comparator", { src: functionalHandler, file: "comparator.java" });

const functionalImplEvent = new Event("FunctionalImplLoaded");
window.addEventListener("FunctionalAnchorLoaded", function () {
	loadImplementation(functionalImplMapping, functionalImplEvent);
});

window.addEventListener("FunctionalImplLoaded", function () {
	document.querySelector(".loader").style.display = "none";
	document.querySelector(".sidebar").style.display = "block";
	document.querySelector(".content").style.display = "block";
});
