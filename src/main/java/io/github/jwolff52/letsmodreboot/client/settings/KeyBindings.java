package io.github.jwolff52.letsmodreboot.client.settings;

import io.github.jwolff52.letsmodreboot.ref.N;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    public static KeyBinding charge = new KeyBinding(N.Keys.CHARGE, Keyboard.KEY_C, N.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(N.Keys.RELEASE, Keyboard.KEY_R, N.Keys.CATEGORY);
}
