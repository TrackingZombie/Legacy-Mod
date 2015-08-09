package com.trackingzombie.legacy.LegacyBlocksandItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.trackingzombie.legacy.LegacyMod;
import com.trackingzombie.legacy.CustomTemplates.CustomBlocks;
import com.trackingzombie.legacy.CustomTemplates.CustomBlocks.HarvestLevelEnum;
import com.trackingzombie.legacy.CustomTemplates.CustomBlocks.HarvestToolEnum;
import com.trackingzombie.legacy.CustomTemplates.CustomItems;

public class LegacyBlocks {
	public static CustomBlocks legacy_ore;
	public static CustomBlocks legacy_nether_ore;
	public static CustomBlocks legacy_end_ore;
	
	public static CustomBlocks legacy_block;
	public static CustomBlocks atom_block;
	public static CustomBlocks ninja_block;
	public static CustomBlocks viking_block;
	public static CustomBlocks angel_block;
	public static void NewBlocks()
	{
		legacy_ore =new CustomBlocks(Material.rock, "legacy_ore", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.IRON, LegacyMod.tabLegacy, 1, 10, 30, 50, 25, 30, true, false, false);
		legacy_nether_ore =  new CustomBlocks(Material.rock, "legacy_nether_ore", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.DIAMOND, LegacyMod.tabLegacy, 1, 1, 3, 15, 5, 30,new Block[]{Blocks.netherrack}, false, true, false);
		legacy_end_ore =  new CustomBlocks(Material.rock, "legacy_end_ore", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.DIAMOND, LegacyMod.tabLegacy, 1, 1, 3, 15, 5, 30,new Block[]{Blocks.end_stone}, false, false ,true);
		
		legacy_block = new CustomBlocks(Material.rock, "legacy_block", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.WOOD, LegacyMod.tabLegacy, 1);
		angel_block = new CustomBlocks(Material.rock, "angel_block", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.WOOD, LegacyMod.tabLegacy, 1);
		atom_block = new CustomBlocks(Material.rock, "atom_block", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.WOOD, LegacyMod.tabLegacy, 1);
		ninja_block = new CustomBlocks(Material.rock, "ninja_block", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.WOOD, LegacyMod.tabLegacy, 1);
		viking_block = new CustomBlocks(Material.rock, "viking_block", 3.0F, 5.0F, HarvestToolEnum.PICKAXE, HarvestLevelEnum.WOOD, LegacyMod.tabLegacy, 1);			
	}
	

	public static void drops()
	{
		//Vanila code....Block will drop itself when mined...Example mining iron ore will yeld iron ore..
		//setDrops are used to set itemdrop or diffrent Blockore...upon braking the block.
		//So this code is saying: You want me to drop same blocks....but i do need this line of code to do it
		// ..but you are the boss :P
		
		
		/*
		legacy_ore.setDrops(legacy_ore);
		legacy_nether_ore.setDrops(legacy_nether_ore);
		legacy_end_ore.setDrops(legacy_end_ore);
		
		legacy_block.setDrops(legacy_block);
		angel_block.setDrops(angel_block);
		atom_block.setDrops(atom_block);	
		ninja_block.setDrops(ninja_block);
		
		viking_block.setDrops(viking_block);
		*/

	}
	
	//I would name this to RenderBlockTexture.....just saying. 
	public static void Render()
	{
		legacy_ore.RegisterRenderer("legacy_ore");
		legacy_nether_ore.RegisterRenderer("legacy_nether_ore");
		legacy_end_ore.RegisterRenderer("legacy_end_ore");
		
		
		legacy_block.RegisterRenderer("legacy_block");
		angel_block.RegisterRenderer("angel_block");
		atom_block.RegisterRenderer("atom_block");
		ninja_block.RegisterRenderer("ninja_block");
		viking_block.RegisterRenderer("viking_block");
		
	}
	public static void recipe(){
		GameRegistry.addRecipe(new ItemStack(legacy_block,1), new Object[] {"AAA", "AAA", "AAA", 'A', LegacyItems.legacy_gem });
		GameRegistry.addRecipe(new ItemStack(angel_block,1), new Object[] {"AAA", "AAA", "AAA", 'A', LegacyItems.angel_ingot });
		GameRegistry.addRecipe(new ItemStack(atom_block,1), new Object[] {"AAA", "AAA", "AAA", 'A', LegacyItems.atom_ingot });
		GameRegistry.addRecipe(new ItemStack(ninja_block,1), new Object[] {"AAA", "AAA", "AAA", 'A', LegacyItems.ninja_ingot });
		GameRegistry.addRecipe(new ItemStack(viking_block,1), new Object[] {"AAA", "AAA", "AAA", 'A', LegacyItems.viking_ingot });
		

		GameRegistry.addRecipe(new ItemStack(LegacyItems.legacy_gem,9),  new Object[]{"a", 'a',legacy_block});
		GameRegistry.addRecipe(new ItemStack(LegacyItems.angel_ingot,9),  new Object[]{"a", 'a',angel_block});
		GameRegistry.addRecipe(new ItemStack(LegacyItems.atom_ingot,9),  new Object[]{"a ", 'a',atom_block});
		GameRegistry.addRecipe(new ItemStack(LegacyItems.ninja_ingot,9),  new Object[]{"a", 'a',ninja_block});
		GameRegistry.addRecipe(new ItemStack(LegacyItems.viking_ingot,9),  new Object[]{"a", 'a',viking_block});

		

		GameRegistry.addSmelting((LegacyBlocks.legacy_ore),new ItemStack(LegacyItems.legacy_gem,1) , 1);
		GameRegistry.addSmelting((LegacyBlocks.legacy_nether_ore),new ItemStack(LegacyItems.legacy_gem,2) , 2);
		GameRegistry.addSmelting((LegacyBlocks.legacy_end_ore),new ItemStack(LegacyItems.legacy_gem,5) , 4);		
		
		

	}
	
}
