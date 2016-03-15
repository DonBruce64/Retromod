package retro.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import retro.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class A8bitmario extends Item{
	public static final String _8bitmario_unlocalizedName = "_8bitmario";
	public static final String _8bitmario_name = "8 Bit Mario";
	
	public A8bitmario(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(_8bitmario_unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + _8bitmario_unlocalizedName);
	}
}
