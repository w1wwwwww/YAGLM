package com.w1wwwwww.yaglm.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "yaglm")
public class ModConfig implements ConfigData {
    boolean autoCheckForUpdates = true;
}
