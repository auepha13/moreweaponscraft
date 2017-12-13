package com.moreweaponscraft.crafting;

import com.moreweaponscraft.init.Swords;
import com.moreweaponscraft.util.JointList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ACCraftingManager {
	
	public static void mainRegistry() {

		addCraftingRecipes();
	}
	
	// tiers of upgrades
	public static final int TIER_1 = 0;
	public static final int TIER_2 = 1;
	

	
	private static void addCraftingRecipes() {


		RecipeHelper.addShapedOreRecipe(new ItemStack(Swords.theFirst, 1), "XXX","XIX","XXX", 'X',"blockEmerald", 'I',Items.GOLDEN_SWORD);
		RecipeHelper.addShapedOreRecipe(new ItemStack(Swords.theExcalibur, 1), "XXX","XIX","XXX", 'X',"blockDiamond", 'I',Items.DIAMOND_SWORD);


	}
	
	/** Adds a tier 1 recipe with 'I' set to paper */
	private static void addTier1Recipe(Item result, Object... recipe) {
		JointList rec = new JointList().join(recipe).join('I', Items.PAPER);
		RecipeHelper.addShapedOreRecipe(new ItemStack(result, 1, TIER_1), rec.toArray(new Object[recipe.length]));
	}

	/** Adds a tier 2 recipe with 'A' set to the tier 1 result */
	private static void addTier2Recipe(Item result, Object... recipe) {
		JointList rec = new JointList().join(recipe).join('A', new ItemStack(result, 1, TIER_1));
		RecipeHelper.addShapedOreRecipe(new ItemStack(result, 1, TIER_2), rec.toArray(new Object[recipe.length]));
	}
	

	}


