package com.colin.cornmagic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "cornmagic";
    public static final String VERSION = "0.1";

    public static Item carcinogen;
    public static Block carcinogenOre;
    public static BlockBush whiteCorn;
    public static Item whiteCob;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        carcinogen = new ModItem("carcinogen");
        GameRegistry.registerItem(carcinogen, "carcinogen");

		carcinogenOre = new ModBlock(Material.rock, "carcinogenOre", 5.0F, "pickaxe", 1, carcinogen);
		GameRegistry.registerBlock(carcinogenOre, "carcinogenOre");

		whiteCorn = new BlockCorn("whiteCorn", whiteCob);
		whiteCob = new ItemCorn("whiteCob", 1, 0.2F, whiteCorn, Blocks.farmland);
		GameRegistry.registerBlock(whiteCorn, "whiteCorn");
		GameRegistry.registerItem(whiteCob, "whiteCob");

		GameRegistry.registerWorldGenerator(new ModWorldGenerator(carcinogenOre, 6, 20, 12, 64), 0);
    }

}
