package io.github.jwolff52.letsmodreboot.init;


import cpw.mods.fml.common.registry.GameRegistry;
import io.github.jwolff52.letsmodreboot.item.ItemLMRB;
import io.github.jwolff52.letsmodreboot.item.ItemMapleLeaf;

public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
