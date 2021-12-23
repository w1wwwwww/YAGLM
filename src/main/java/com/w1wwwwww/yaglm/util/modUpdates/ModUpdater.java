package com.w1wwwwww.yaglm.util.modUpdates;

import com.w1wwwwww.yaglm.config.ConfigScreen;
import com.w1wwwwww.yaglm.util.internet.InternetAvailabilityChecker;
import me.shedaniel.autoconfig.AutoConfig;

import java.util.Objects;

public class ModUpdater {
    ConfigScreen config = AutoConfig.getConfigHolder(ConfigScreen.class).getConfig();

    public void updateMod(String modToUpdate) {
        checkForUpdatedModVersions();

    }

    private String checkForUpdatedModVersions() {
        if (Objects.equals(InternetAvailabilityChecker.getInternetStatus(config.internetUrl), "On")) {
            if (config.autoCheckForUpdates) {
                return "Updating";
            } else {
                return "Auto updates are disabled";
            }
        } else {
            return "Internet not available";
        }
    }
}
