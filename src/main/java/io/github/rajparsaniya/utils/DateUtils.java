package io.github.rajparsaniya.utils;

import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@UtilityClass
public class DateUtils {
    @NotNull
    @Contract(pure = true)
    public static Date getDate() {
        return new Date(System.currentTimeMillis());
    }

    @NotNull
    @Contract(pure = true)
    public static Date getBeforeDate(final long millis) {
        return new Date(System.currentTimeMillis() - millis);
    }

    @NotNull
    @Contract(pure = true)
    public static Date getAfterDate(final long millis) {
        return new Date(System.currentTimeMillis() + millis);
    }
}
