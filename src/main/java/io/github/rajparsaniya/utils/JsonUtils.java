package io.github.rajparsaniya.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import io.github.rajparsaniya.exception.JsonUtilityException;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@UtilityClass
public class JsonUtils {
    private static final Gson mGson = new Gson();

    @NotNull
    public static <T> T fromJson(@NotNull final String source, @NotNull final Class<T> type) {
        try {
            return mGson.fromJson(source, type);
        } catch (JsonSyntaxException e) {
            throw new JsonUtilityException(e);
        }
    }

    @NotNull
    public static <T> String toJson(@Nullable final T source) {
        return mGson.toJson(source);
    }

    @NotNull
    public static String toJson(@NotNull final String source) {
        try {
            final JsonElement element = JsonParser.parseString(source);
            return mGson.toJson(element);
        } catch (JsonParseException e) {
            throw new JsonUtilityException(e);
        }
    }
}
