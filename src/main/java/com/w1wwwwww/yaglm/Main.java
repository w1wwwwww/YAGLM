package com.w1wwwwww.yaglm;

import com.w1wwwwww.yaglm.config.ConfigScreen;
import com.w1wwwwww.yaglm.util.ModVersionChecker;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public Main instance;

	@Override
	public void onInitialize() {
		instance = this;
		AutoConfig.register(ConfigScreen.class, GsonConfigSerializer::new);
		ModVersionChecker checker = new ModVersionChecker();

		System.out.println(checker.CheckForUpdatedModVersions());
	}
}
