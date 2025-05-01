package io.github.rajparsaniya.function.stream.core;

/**
 * A comparison function, which imposes a <i>total ordering</i> on
 * some collection of objects.
 *
 * <p>This interface is a member of the
 * <a href="{@docRoot}/java.base/java/util/package-summary.html#CollectionsFramework">
 * Java Collections Framework</a>.
 *
 * @param <T> the type of objects that may be compared by this comparator.
 * @author Raj Parsaniya
 * @see Comparable
 * @since 1.0.0
 */
@FunctionalInterface
public interface IComparator<T> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     *
     * @param o1     the first object to be compared.
     * @param o2     the second object to be compared.
     * @param index1 the index of the first element.
     * @param index2 the index of the second element.
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    int compare(final T o1, final T o2, final int index1, final int index2) throws Exception;
}
