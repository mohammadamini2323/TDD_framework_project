package base;

import config.Properties_loader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    public static final Logger logger= LogManager.getLogger(BaseTest.class);
    public static  String baseUrl;
    public static boolean debugLogging;
    @BeforeEach
    public void setup(){
        baseUrl= Properties_loader.get("base.url");
        debugLogging=Boolean.parseBoolean(Properties_loader.get("enable.debug.logging"));
        if (debugLogging){ Configurator.setRootLevel(Level.DEBUG);
        logger.debug("enabled debugging mode");} else {
            Configurator.setRootLevel(Level.INFO);
            logger.info("enabled info level mode");
        }
        logger.info("BASE URL: {}",baseUrl);
    }
    public void log(String message){
        if (debugLogging){ logger.debug(message);}else {logger.info(message);}
    }


    }

