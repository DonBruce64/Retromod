package retro.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class SMBBlockmetahandler extends ItemBlock {
public SMBBlockmetahandler(int id) {
super(id);
setHasSubtypes(true);
}

@Override
public String getUnlocalizedName(ItemStack itemstack) {
return Supermariobrosblocks.supermariobrosblocks_unlocalizedName[itemstack.getItemDamage()];
}

@Override
public int getMetadata(int damage) {
return damage;
}
}