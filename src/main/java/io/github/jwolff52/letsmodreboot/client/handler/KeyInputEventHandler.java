package io.github.jwolff52.letsmodreboot.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import io.github.jwolff52.letsmodreboot.client.settings.KeyBindings;
import io.github.jwolff52.letsmodreboot.ref.Key;
import io.github.jwolff52.letsmodreboot.util.LogHelper;

public class KeyInputEventHandler {
    private static Key getPressedKeybinding() {
        if (KeyBindings.charge.isPressed()) {
            return Key.CHARGE;
        } else if (KeyBindings.release.isPressed()) {
            return Key.RELEASE;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent e) {
        LogHelper.info(getPressedKeybinding());
    }
}
