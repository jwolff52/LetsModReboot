package io.github.jwolff52.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init() {
//        GameRegistry.addShapedRecipe(new ItemStack(ModItems.mapleLeaf), " r ", "rrr", " s ", 'r', new ItemStack(Items.dye, 1, 1), 's', new ItemStack(Items.stick));
//        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(Blocks.cobblestone));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " r ", "rrr", " s ", 'r', "dyeRed", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), "cobblestone"));
    }
}
