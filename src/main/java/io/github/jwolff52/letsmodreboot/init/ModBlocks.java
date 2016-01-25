package io.github.jwolff52.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.jwolff52.letsmodreboot.block.BlockFlag;
import io.github.jwolff52.letsmodreboot.block.BlockLMRB;
import io.github.jwolff52.letsmodreboot.ref.R;

@GameRegistry.ObjectHolder(R.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }
}
