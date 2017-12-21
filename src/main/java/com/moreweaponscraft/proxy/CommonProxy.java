package com.moreweaponscraft.proxy;

import com.moreweaponscraft.config.ACConfig;
import com.moreweaponscraft.crafting.ACCraftingManager;
import com.moreweaponscraft.creativetabs.ACCreativeTabs;
import com.moreweaponscraft.events.InformationHandler;
import com.moreweaponscraft.init.ACItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/** Mod common initialization code */
public class CommonProxy   {
	
	public void preInit(FMLPreInitializationEvent event) {
		ACConfig.mainRegistry(event.getSuggestedConfigurationFile());
		ACCreativeTabs.mainRegistry();
		ACItems.mainRegistry();

	}
	
	public void onInit(FMLInitializationEvent event) {
		ACCraftingManager.mainRegistry();
		ACCreativeTabs.updateCreativeTabs();

	}
	
	public void postInit(FMLPostInitializationEvent event) {


		MinecraftForge.EVENT_BUS.register(new InformationHandler());
		//MinecraftServer.getServer

		//ClientCommandHandler.instance.executeCommand(Minecraft.getMinecraft(),message:"/give @p moreweaponscraft:the_first");
		//ClientCommandHandler.instance.executeCommand(Minecraft.getMinecraft().player, "/give  @p moreweaponscraft:the_first");


	//	Minecraft.getMinecraft().getNetHandler().addToSendQueue(new CPacketChatMessage("/help"));

		//Minecraft.getMinecraft().


	//	ClientCommandHandler.instance.executeCommand(FMLClientHandler.instance().getClientPlayerEntity(), "/say es funktioniert");


	}
			
}
