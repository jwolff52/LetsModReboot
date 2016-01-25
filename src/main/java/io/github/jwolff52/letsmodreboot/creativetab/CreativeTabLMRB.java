package io.github.jwolff52.letsmodreboot.creativetab;

import io.github.jwolff52.letsmodreboot.init.ModItems;
import io.github.jwolff52.letsmodreboot.ref.R;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB {
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(R.MOD_ID.toLowerCase()){
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };
}
