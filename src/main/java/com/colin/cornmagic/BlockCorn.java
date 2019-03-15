package com.colin.cornmagic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class BlockCorn extends ModCrop
{
    private String blockname;
    private Item toDrop;

    public BlockCorn(String blockname, String blocktexturename, Item toDrop)
    {
        setBlockName(blockname);
        this.blockname = blockname;
        setBlockTextureName(blocktexturename);
        this.toDrop = toDrop;
    }

    //returns how many items to drop on breaking
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata / 2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)
    {
        System.out.println("BlockCorn getItemDropped()");
        return (toDrop);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
        iIcon = new IIcon[maxGrowthStage + 1];

        iIcon[0] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_0");
        iIcon[1] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_1");
        iIcon[2] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_2");
        iIcon[3] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_3");
        iIcon[4] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_4");
        iIcon[5] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_5");
        iIcon[6] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_6");
        iIcon[7] = parIIconRegister.registerIcon("cornmagic:" + blockname + "_stage_7");
    }
}
