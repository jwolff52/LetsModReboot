package io.github.jwolff52.letsmodreboot.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import io.github.jwolff52.letsmodreboot.handler.ConfigurationHandler;
import io.github.jwolff52.letsmodreboot.ref.R;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;


public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                R.MOD_ID,
                false,
                false,
                ModGuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
    }
}
