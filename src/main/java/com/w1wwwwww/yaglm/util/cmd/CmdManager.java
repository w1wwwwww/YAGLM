package com.w1wwwwww.yaglm.util.cmd;

import java.io.IOException;

public class CmdManager {
    public static String terminal = null;

    private static final String os = System.getProperty("os.name");

    public static String getOs() {
        return os;
    }

    public static void executeCommand(String command) throws IOException {
        getTerminal();
        Process process = Runtime.getRuntime().exec(terminal + command);
        process.destroy();
    }

    private static void getTerminal() {
        if (os.contains("Windowws")) {
            terminal = "cmd /C";
        } else {
            terminal = "sh -c";
        }
    }
}
