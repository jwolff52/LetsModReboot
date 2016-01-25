package io.github.jwolff52.letsmodreboot.proxy;


import cpw.mods.fml.client.registry.ClientRegistry;
import io.github.jwolff52.letsmodreboot.client.settings.KeyBindings;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}
