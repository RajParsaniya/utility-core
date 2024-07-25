package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.TypeUtilityException;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;

@UtilityClass
public class TypeUtils {
    @NotNull
    public static <T, R> R cast(@NotNull final T source, @NotNull final Class<R> type) {
        try {
            return type.cast(source);
        } catch (ClassCastException e) {
            throw new TypeUtilityException(e);
        }
    }
}
