package io.github.jwolff52.letsmodreboot;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.jwolff52.letsmodreboot.client.handler.KeyInputEventHandler;
import io.github.jwolff52.letsmodreboot.handler.ConfigurationHandler;
import io.github.jwolff52.letsmodreboot.init.ModBlocks;
import io.github.jwolff52.letsmodreboot.init.ModItems;
import io.github.jwolff52.letsmodreboot.init.Recipes;
import io.github.jwolff52.letsmodreboot.proxy.IProxy;
import io.github.jwolff52.letsmodreboot.ref.R;
import io.github.jwolff52.letsmodreboot.util.LogHelper;

@Mod(modid = R.MOD_ID, name = R.MOD_NAME, version = R.VERSION, guiFactory = R.GUI_FACTORY)
public class LetsModReboot {

    @Mod.Instance(R.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = R.CLIENT_PROXY, serverSide = R.SERVER_PROXY)
    public static IProxy proxy;

    /**
     *
     * @param e
     *
     * Configs, Keybindings
     * Items and Blocks
     *
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        instance = this;

        ConfigurationHandler.init(e.getSuggestedConfigurationFile());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre-Initilization complete");
    }

    /**
     *
     * @param e
     *
     * GUI Handler
     * Rendering
     * Tile Entities
     * Recipes
     *
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        Recipes.init();
        LogHelper.info("Initilization complete");
    }

    /**
     *
     * @param e
     *
     * Wrap things up
     *
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        LogHelper.info("Post-Initilization complete");
    }
}
