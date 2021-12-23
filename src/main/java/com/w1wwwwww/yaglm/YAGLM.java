package com.w1wwwwww.yaglm;

import com.w1wwwwww.yaglm.config.ConfigScreen;
import com.w1wwwwww.yaglm.setup.SetupHandler;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

import java.io.IOException;

public class YAGLM implements ModInitializer {
	public YAGLM instance;

	@Override
	public void onInitialize() {
		instance = this;
		AutoConfig.register(ConfigScreen.class, GsonConfigSerializer::new);
		try {
			SetupHandler.runInitialSetup();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
