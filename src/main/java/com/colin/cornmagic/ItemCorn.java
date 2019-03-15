package com.colin.cornmagic;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCorn extends ModSeed
{
    public ItemCorn(String name, int healAmount, Float saturation, Block plantBlock, Block farmBlock)
    {
        super(healAmount, saturation, plantBlock, farmBlock);
        setUnlocalizedName(name);
        setTextureName("cornmagic:" + name);
        setCreativeTab(CreativeTabs.tabFood);
    }
}
