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

@Mod(modid = CornMagic.MODID, version = CornMagic.VERSION)
public class CornMagic
{
    public static final String MODID = "cornmagic";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		Block carcinogen = new ModBlock(Material.rock, "carcinogen", 5.0F, "pickaxe", 1,null);
		GameRegistry.registerBlock(carcinogen, "carcinogen");
    }

    private class ModBlock extends Block
    {
        private Item toDrop;

        public ModBlock(Material material, String blockName, float hardness, String tool, int level, Item toDrop)
        {
            super(material);
            this.setBlockName(blockName);
            this.setBlockTextureName(MODID + ":" + blockName);
            this.setCreativeTab(CreativeTabs.tabBlock);
            this.setHardness(hardness);
            this.setHarvestLevel(tool, level);
            this.toDrop = toDrop;
        }

        public Item getItemDropped(int i, Random random, int j) {
            if(toDrop != null)
            {
                return toDrop;
            }
            else return Item.getItemFromBlock(this);
        }
    }

    private class ModItem extends Item
    {
        public ModItem(String itemName)
        {
            this.setUnlocalizedName(itemName);
            this.setTextureName(MODID + ":" + itemName);
            this.setCreativeTab(CreativeTabs.tabMisc);
        }
    }
}
