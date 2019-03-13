package com.colin.cornmagic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import scala.util.Random;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "cornmagic";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Item carcinogen = new ModItem("carcinogen");
        GameRegistry.registerItem(carcinogen, "carcinogen");

		Block carcinogenOre = new ModBlock(Material.rock, "carcinogenOre", 5.0F, "pickaxe", 1, carcinogen);
		GameRegistry.registerBlock(carcinogenOre, "carcinogenOre");
    }

}
