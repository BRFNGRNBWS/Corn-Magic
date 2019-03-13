package com.colin.cornmagic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import scala.util.Random;

public class ModBlock extends Block
{
    private Item toDrop;

    public ModBlock(Material material, String blockName, float hardness, String tool, int level, Item toDrop)
    {
        super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + blockName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setHarvestLevel(tool, level);
        this.toDrop = toDrop;
    }

    @Override
    public Item getItemDropped(int i, Random random, int j) {
        if(toDrop != null)
        {
            return toDrop;
        }
        else return Item.getItemFromBlock(this);
    }
}