package com.moreweaponscraft;

import com.moreweaponscraft.proxy.CommonProxy;
import com.moreweaponscraft.ref.RefStrings;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MoreWeaponsCraft {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static CommonProxy proxy;

	@Instance(RefStrings.MODID)
	public static MoreWeaponsCraft modInstance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);


	//	ClientCommandHandler.instance.executeCommand(FMLClientHandler.instance().getClientPlayerEntity(), "/say es funktioniert");

	}

}
