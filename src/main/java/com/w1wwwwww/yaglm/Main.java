package com.w1wwwwww.yaglm;

import com.w1wwwwww.yaglm.config.ModConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	private static Main instance;

	@Override
	public void onInitialize() {
		instance = this;
		Logger logger = LogManager.getLogger("YAGLM");

		AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
	}
}
