package retro;

import retro.blocks.RetroBlocks;
import retro.items.RetroItems;
import retro.lib.ModInfo;
import retro.lib.RetroRecipies;
import retro.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = false)

public class Retro {
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + "ClientProxy", serverSide = ModInfo.PROXY_LOCATION + "CommonProxy" )
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		proxy.initRenderers();
		proxy.initSounds();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RetroItems.init();	
		RetroItems.addNames();
		RetroBlocks.init();
		RetroBlocks.addNames();
		RetroRecipies.init();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}
}
