package com.w1wwwwww.yaglm.setup;

import com.w1wwwwww.yaglm.config.ConfigScreen;
import com.w1wwwwww.yaglm.util.internet.FileDownloader;
import me.shedaniel.autoconfig.AutoConfig;

import java.io.IOException;

public class SetupHandler {
    static ConfigScreen config = AutoConfig.getConfigHolder(ConfigScreen.class).getConfig();

    public static void runInitialSetup() throws IOException {
        downloadHotswapper();
        config.hasBeenSetup = true;
    }

    private static void downloadHotswapper() throws IOException {
        if (!config.hasBeenSetup) {
            FileDownloader.downloadFile("https://github.com/w1wwwwww/Hotswapper/raw/master/out/artifacts/Hotswapper_jar/Hotswapper.jar", "Hotswapper.jar");
        }
    }
}
