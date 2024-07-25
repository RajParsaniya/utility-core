package io.github.rajparsaniya.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.rajparsaniya.exception.ObjectUtilityException;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modelmapper.ModelMapper;

@UtilityClass
public class ObjectUtils {
    private static final ModelMapper mModelMapper = new ModelMapper();
    private static final ObjectMapper mObjectMapper = new ObjectMapper();

    @NotNull
    public static <T, R> R convertValue(@NotNull final T source, @NotNull final Class<R> type) {
        try {
            return mModelMapper.map(source, type);
        } catch (IllegalArgumentException e) {
            throw new ObjectUtilityException(e);
        }
    }

    @NotNull
    public static <T> T updateValue(@NotNull final T target, @NotNull final String source) {
        try {
            return mObjectMapper.readerForUpdating(target).readValue(source);
        } catch (JsonProcessingException e) {
            throw new ObjectUtilityException(e);
        }
    }

    @NotNull
    public static <T, R> T updateValue(@NotNull final T target, @Nullable final R source) {
        try {
            final String json = JsonUtils.toJson(source);
            return mObjectMapper.readerForUpdating(target).readValue(json);
        } catch (JsonProcessingException e) {
            throw new ObjectUtilityException(e);
        }
    }
}
