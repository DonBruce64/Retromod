package retro.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import retro.blocks.RetroBlocks;
import retro.items.RetroItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class RetroRecipies {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,0), new Object[]{
			new ItemStack(Block.stoneSingleSlab,1,0x4), new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,1), new Object[]{
			new ItemStack(Block.stoneSingleSlab,1,0x6), new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,2), new Object[]{
			Block.cobblestone, Item.bucketWater, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,3), new Object[]{
			Block.stoneBrick, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,4), new Object[]{
			Block.stone, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,5), new Object[]{
			Block.cobblestone, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,6), new Object[]{
			Block.netherrack, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,7), new Object[]{
			Block.stairsBrick, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,8), new Object[]{
			Block.stairsNetherBrick, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,9), new Object[]{
			Block.brick, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,10), new Object[]{
			Block.netherBrick, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,11), new Object[]{
			new ItemStack(RetroBlocks.Marioblocks,1,4), Block.glowStone, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,12), new Object[]{
			new ItemStack(RetroBlocks.Marioblocks,1,5), Block.glowStone, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroBlocks.Marioblocks,1,13), new Object[]{
			new ItemStack(RetroBlocks.Marioblocks,1,6), Block.glowStone, new ItemStack(RetroItems._8bitmario)
		});
		GameRegistry.addRecipe(new ItemStack(RetroItems._8bitmario,8), new Object[]{
						"CMC",
						"CXC",
						"RGB",
						'C',Block.glass,'M',Block.mushroomRed,
						'X',Block.brick,
						'R',new ItemStack(Item.dyePowder,1,1),'G',new ItemStack(Item.dyePowder,1,2),'B', new ItemStack(Item.dyePowder,1,4),
		});
		GameRegistry.addRecipe(new ItemStack(RetroItems._8bitlink,8), new Object[]{
						"CMC",
						"CXC",
						"RGB",
						'C',Block.glass,
						'M',new ItemStack(Item.arrow), 'X',new ItemStack(Item.glassBottle),
						'R',new ItemStack(Item.dyePowder,1,1),'G',new ItemStack(Item.dyePowder,1,2),'B', new ItemStack(Item.dyePowder,1,4),
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroItems.zeldasword), new Object[]{
			Item.ingotGold, Item.swordWood, new ItemStack(RetroItems._8bitlink)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(RetroItems.zeldabow), new Object[]{
			Item.ingotGold, Item.bow, new ItemStack(RetroItems._8bitlink)
		});
	}
}
