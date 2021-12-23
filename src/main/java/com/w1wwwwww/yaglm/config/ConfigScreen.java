package com.w1wwwwww.yaglm.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "yaglm")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class ConfigScreen implements ConfigData {
    public boolean autoCheckForUpdates = true;
    public String internetUrl = "https://www.google.com";

    public boolean hasBeenSetup = false;
}
