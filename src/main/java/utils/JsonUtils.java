package utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class JsonUtils {
    public static String readJsonFile(String JsonFileName) throws URISyntaxException, IOException {
        URI jsonURI= Objects.requireNonNull(JsonUtils.class.getClassLoader().getResource(JsonFileName)).toURI();
        return new String(Files.readAllBytes(Paths.get(jsonURI)));
    }
}
