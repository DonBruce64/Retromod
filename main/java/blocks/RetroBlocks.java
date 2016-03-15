package retro.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import retro.lib.RetroIds;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RetroBlocks {

	public static Block Marioblocks;

	public static void init(){		
		Marioblocks = new Supermariobrosblocks(RetroIds.marioblocks);
		GameRegistry.registerBlock(Marioblocks, SMBBlockmetahandler.class);
		}
	
	public static void addNames() {
		for(int i = 0; i < Supermariobrosblocks.supermariobrosblocks_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(Marioblocks, 1, i), Supermariobrosblocks.supermariobrosblocks_name[i]);
			}
	}
}
