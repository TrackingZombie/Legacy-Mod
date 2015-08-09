package com.trackingzombie.legacy.LegacyBlocksandItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.trackingzombie.legacy.LegacyMod;
import com.trackingzombie.legacy.CustomTemplates.CustomItems;



public class LegacyItems {
	public static CustomItems legacy_gem;
	public static CustomItems angel_ingot;
	public static CustomItems atom_ingot;
	public static CustomItems ninja_ingot;
	public static CustomItems viking_ingot;

	public static void normalitem(){
		
		legacy_gem = new CustomItems("legacy_gem", LegacyMod.tabLegacy, 64);
		angel_ingot= new CustomItems("angel_ingot", LegacyMod.tabLegacy, 64);
		atom_ingot= new CustomItems("atom_ingot", LegacyMod.tabLegacy, 64);
		ninja_ingot= new CustomItems("ninja_ingot", LegacyMod.tabLegacy, 64);
		viking_ingot= new CustomItems("viking_ingot", LegacyMod.tabLegacy, 64);		
		
	}
	public static void Render()
	{
		legacy_gem.RegisterRenderer("legacy_gem");
		angel_ingot.RegisterRenderer("angel_ingot");
		atom_ingot.RegisterRenderer("atom_ingot");
		ninja_ingot.RegisterRenderer("ninja_ingot");
		viking_ingot.RegisterRenderer("viking_ingot");
		
	}
	public static void recipe()
	{
		GameRegistry.addRecipe(new ItemStack(angel_ingot,6), new Object[] {"GWG", "FLF", "GWG", 'G', Items.gold_ingot, 'F', Items.feather,'L', legacy_gem, 'W', Blocks.wool });
		GameRegistry.addRecipe(new ItemStack(atom_ingot,6), new Object[] { "GWG","FLF", "GWG", 'G', Items.iron_ingot, 'F', Blocks.obsidian, 'L',legacy_gem, 'W', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(ninja_ingot,6), new Object[] {"GWG", "FLF", "GWG", 'G', Items.iron_ingot, 'F', Items.leather,'L', legacy_gem, 'W', Blocks.cactus });
		GameRegistry.addRecipe(new ItemStack(viking_ingot,6), new Object[] {"GWG", "FLF", "GWG", 'G', Items.iron_ingot, 'F',Items.milk_bucket, 'L', legacy_gem, 'W', Blocks.cactus });
	
		
	
	}
}
