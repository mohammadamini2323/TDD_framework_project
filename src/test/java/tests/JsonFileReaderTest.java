package tests;

import utils.JsonUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class JsonFileReaderTest {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println(JsonUtils.readJsonFile("user.json"));
    }
}
