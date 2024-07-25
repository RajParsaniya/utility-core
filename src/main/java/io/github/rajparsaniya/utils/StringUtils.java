package io.github.rajparsaniya.utils;

import io.github.rajparsaniya.exception.StringUtilityException;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.UnsupportedEncodingException;

@UtilityClass
public class StringUtils {
    public static boolean isNullOrEmpty(@Nullable final String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNullOrBlank(@Nullable final String str) {
        return str == null || str.isBlank();
    }

    @NotNull
    @Contract(pure = true)
    public static String toString(final byte @NotNull [] bytes, @NotNull final String encoding) {
        try {
            return new String(bytes, encoding);
        } catch (UnsupportedEncodingException e) {
            throw new StringUtilityException(e);
        }
    }
}
