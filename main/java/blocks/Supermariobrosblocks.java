package retro.blocks;

import java.util.List;

import retro.lib.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class Supermariobrosblocks extends Block {
	public static final String[] supermariobrosblocks_unlocalizedName = {
		"marioblockbase", //0
		"marioblockunderworldbase", //1
		"marioblockwaterworld", //2
		"marioblockcastle", //3
		"marioblockempty", //4
		"marioblockunderworldempty", //5
		"marioblockcastleempty", //6
		"marioblockstair", //7
		"marioblockunderworldstair", //8
		"marioblockbrick", //9
		"marioblockunderworldbrick", //10
		"marioblockquestion", //11
		"marioblockunderworldquestion", //12
		"marioblockcastlequestion" //13
		};

		public static final String[] supermariobrosblocks_name = {
		"Mario Block -Base",
		"Mario Block -Underworld Base",
		"Mario Block -Waterworld",
		"Mario Block -Castle",
		"Mario Block -Empty",
		"Mario Block -Underworld Empty",
		"Mario Block -Castle Empty",
		"Mario Block -Stair",
		"Mario Block -Underworld Stair",
		"Mario Block -Brick",
		"Mario Block -Underworld Brick",
		"Mario Block -Question",
		"Mario Block -Underworld Question",
		"Mario Block -Castle Question"


		};

	public Supermariobrosblocks(int id) {
		super(id, Material.rock);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	//double array for multiple item textures
	@SideOnly(Side.CLIENT)
	public static Icon[][] icons;

	//initialization phase, the if statement is used to control texture
	//handling for top-bottom-side textured blocks
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		icons = new Icon[supermariobrosblocks_unlocalizedName.length][2];
		
		for(int i = 0; i < icons.length; i++) {
			if(i==9||i>=11){
				this.icons[i][0] = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + supermariobrosblocks_unlocalizedName[i] + "_top");
				this.icons[i][1] = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + supermariobrosblocks_unlocalizedName[i]);
			}
			else{
				icons[i][0] = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + supermariobrosblocks_unlocalizedName[i]);
			}
		}
	}
	//if the block is multi-textured, stores each texture in a seperate element
	//else defaults to single texture
	@Override
	public Icon getIcon(int side, int meta) {	
		if(meta==9||meta>=11){
			if(side == 0||side==1) {
				return icons[meta][0];
				} 
			else {
				return icons[meta][1];
				}
			}
		return icons[meta][0];
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for(int i = 0; i < supermariobrosblocks_name.length; i++) {
	list.add(new ItemStack(this, 1, i));
		}
	}
}