package com.moreweaponscraft.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ACConfig {
	
	// config file
	private static Configuration config;
	
	public static void mainRegistry(File f) {
		config = new Configuration(f);
		getConfig();
	}
	

	public static boolean enableEnchantmentUpgrades;
	public static boolean jeiIntegration;
	public static String emeraldSwordBase;
	public static int emeraldSwordDamage;
	

	public static boolean durabilityTooltips;
	public static List<String> tooltipModBL;


	
	/** Do it up */
	private static void getConfig() {
		final String OPTIONS = config.CATEGORY_GENERAL;
		
		config.load();
		
		// Vanilla
		enableEnchantmentUpgrades = config.getBoolean("Enable enchantment upgrades", OPTIONS, true, "");
		jeiIntegration = config.getBoolean("Show Enchantment Upgrade Recipes in JEI", OPTIONS, true, "Disable to reduce memory usage");
		emeraldSwordBase = config.getString("Base for Advanced Emerald Sword Recipe", OPTIONS, "minecraft:golden_sword", "");
		emeraldSwordDamage = config.getInt("Emerald Sword Attack Damage", OPTIONS, 18, 15, 30, "");
		
		// Advanced Addons
		durabilityTooltips = config.getBoolean("Better Durability Tooltips", OPTIONS, true,
				"Always show the durability of an item in its tooltip (regular or advanced tooltip mode), and in a more aesthetic manner than vanilla.");
		tooltipModBL = Arrays.asList(config.getStringList("Tooltip Mod Blacklist", OPTIONS, new String[]{"tconstruct"},
				"Mods (by mod ID) that should not show better durability on their items."));

		if(config.hasChanged()) config.save();
	}

}
