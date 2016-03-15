package retro.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IWorldAccess;
import net.minecraft.world.World;

public class RetroRecord extends ItemRecord{
	
	public static final String record_unlocalizedName = "record";
	public static final String record_name = "Music Disc";
	public final String recordName;

    public RetroRecord(int par1, String par2Str)
    {
        super(par1, par2Str);
        this.recordName = par2Str;
        this.maxStackSize = 1;
        this.setTextureName("record_stal");
        this.setCreativeTab(CreativeTabs.tabMisc);
        }

    @SideOnly(Side.CLIENT)
    @Override
    public String getRecordTitle(){
        return this.recordName;
    }
}
