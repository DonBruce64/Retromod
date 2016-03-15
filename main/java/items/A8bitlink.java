package retro.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import retro.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class A8bitlink extends Item{
	public static final String _8bitlink_unlocalizedName = "_8bitlink";
	public static final String _8bitlink_name = "8 Bit Link";
	
	public A8bitlink(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(_8bitlink_unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.NAME.toLowerCase() + ":" + _8bitlink_unlocalizedName);
	}
}
