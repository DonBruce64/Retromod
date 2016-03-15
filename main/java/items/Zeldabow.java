package retro.items;

import retro.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.command.ICommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class Zeldabow extends ItemBow{
	public static final String zeldabow_unlocalizedName = "zeldabow";
	public static final String zeldabow_name = "Link's Bow";

	public Zeldabow(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(59); //make 384 when xp - comes in
		this.setUnlocalizedName(zeldabow_unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
	@Override
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4){
        int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
        MinecraftForge.EVENT_BUS.post(event);
        
        if (event.isCanceled()){
            return;
        }
        /**meant to be used to remove xp instead of arrows like in the original Zelda game
        *(was actually rupees), but won't work 'till xp can be removed by commands
        
        *MinecraftServer minecraftserver = MinecraftServer.getServer();
        *ICommandManager icommandmanager = minecraftserver.getCommandManager();
        *int q = icommandmanager.executeCommand(minecraftserver, "/xp -1");
        */
        
        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;
        //remove boolean and if() statement when -xp kicks in
        if (flag || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID)){
            EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, 3.0F);
            entityarrow.setIsCritical(false);
            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 0.5F);
            entityarrow.canBePickedUp = 2;
            
            
            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);
            if (k > 0){
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
            }
            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);
            if (l > 0){
                entityarrow.setKnockbackStrength(l);
            }
            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0){
                entityarrow.setFire(100);
            }
            if (flag){   //remove when -xp system kicks in
                entityarrow.canBePickedUp = 2;
            }
            if (!par2World.isRemote){
                par2World.spawnEntityInWorld(entityarrow);
            }
        }
        }
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + zeldabow_unlocalizedName);
	}
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack){
		return RetroItems._8bitlink.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
