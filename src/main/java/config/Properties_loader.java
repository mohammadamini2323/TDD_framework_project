package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Properties_loader {
    public static final Properties properties=new Properties();
        static {
            try {
                InputStream inputStream=Properties_loader.class.getClassLoader().getResourceAsStream("app.properties");
                if (inputStream==null)throw new RuntimeException("INPUT STREAM CANT BR NULL");
                else{
                    properties.load(inputStream);
                }
            }catch (IOException e){
                throw new RuntimeException( "cant find app.properties in resources");
            }

        }
        public static String get(String key){
            return properties.getProperty(key);
        }
        public static String get(String key,String defaultValue){
            return properties.getProperty(key, defaultValue);
        }
}
