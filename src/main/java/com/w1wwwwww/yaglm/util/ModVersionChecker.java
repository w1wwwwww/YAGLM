package com.w1wwwwww.yaglm.util;

import com.w1wwwwww.yaglm.config.ConfigScreen;
import me.shedaniel.autoconfig.AutoConfig;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

public class ModVersionChecker {
    ConfigScreen config = AutoConfig.getConfigHolder(ConfigScreen.class).getConfig();

    public String CheckForUpdatedModVersions() {
        if (Objects.equals(getStatus(), "On")) {
            if (config.autoCheckForUpdates) {
                return "Updating";
            } else {
                return "Auto updates are disables";
            }
        } else {
            return "Internet not available";
        }
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
