package com.w1wwwwww.yaglm.utilites;

import com.w1wwwwww.yaglm.config.ModConfig;
import me.shedaniel.autoconfig.AutoConfig;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

public class ModVersionChecker {
    public static String CheckForUpdatedModVersions() {
        String isInternetAvailable = getStatus();
        ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

        if(config.equals())
    }

    private static String getStatus() {

        String result = "";
        try {
            URL urlObj = new URL("https://www.google.com");
            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
            con.setRequestMethod("GET");
            // Set connection timeout
            con.setConnectTimeout(3000);
            con.connect();

            int code = con.getResponseCode();
            if (code == 200) {
                result = "On";
            }
        } catch (Exception e) {
            result = "Off";
        }
        return result;
    }
}
