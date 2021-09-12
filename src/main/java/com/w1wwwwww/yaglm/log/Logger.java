package com.w1wwwwww.yaglm.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class Logger {
    public static final String MOD_NAME = "YAGLM";

    public static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
