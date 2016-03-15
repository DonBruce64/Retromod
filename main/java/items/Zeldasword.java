package retro.items;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import retro.lib.RetroIds;
import retro.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Zeldasword extends ItemSword{
	public static final String zeldasword_unlocalizedName = "zeldasword";
	public static final String zeldasword_name = "Link's Sword";
	
	public Zeldasword(int id, EnumToolMaterial material) {
		super(id, material);
        this.setMaxStackSize(1);	
        this.setMaxDamage(1561);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(zeldasword_unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + zeldasword_unlocalizedName);
	}
	 public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack){
		 return RetroItems._8bitlink.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
