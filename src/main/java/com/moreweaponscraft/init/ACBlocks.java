package com.moreweaponscraft.init;


import com.moreweaponscraft.api.IBlockAdvanced;
import com.moreweaponscraft.blocks.BlockBasic;
import com.moreweaponscraft.creativetabs.ACCreativeTabs;
import com.moreweaponscraft.registry.RegistryHelper;
import com.moreweaponscraft.util.JointList;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/** Block initialization class */
public class ACBlocks {
	
	private static JointList<IBlockAdvanced> blocks;
	
	public static void mainRegistry() {
		blocks = new JointList();
		addBlocks();
		registerBlocks();
	}
	
	// the blocks
	public static BlockBasic netherStarBlock;
	
	/** Add blocks to the game */
	private static void addBlocks() {
		blocks.join(
			netherStarBlock = (BlockBasic)new BlockBasic(Material.ROCK, 6, 50).setRegistryName("nether_star_block").setCreativeTab(ACCreativeTabs.main)
		);
}
	
	/** Register the blocks */
	private static void registerBlocks() {
		RegistryHelper.registerBlocks(blocks);
	}
	
	/** Register the renderers */
	@SideOnly(Side.CLIENT)
	public static void registerRendering() {
		// iterate through them
		for(IBlockAdvanced block : blocks) {
			block.registerRender();
		}
	}

}
