package io.github.rajparsaniya.function.exception;

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
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     * @throws Exception if the operation results in a checked exception.
     * @since 1.0.0
     */
    int compare(final T o1, final T o2) throws Exception;
}
