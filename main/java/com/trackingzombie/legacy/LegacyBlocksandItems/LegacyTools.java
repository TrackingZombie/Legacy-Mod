package com.trackingzombie.legacy.LegacyBlocksandItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.trackingzombie.legacy.LegacyMod;
import com.trackingzombie.legacy.LegacyBlocksandItems.Tools.Toolssword;

public class LegacyTools {
	public static final Item.ToolMaterial angelP = EnumHelper.addToolMaterial(
			"angelP", 5, 10000, 300f, 20f, 30);

	public static Toolssword angel_sword;
	public static Toolssword atom_sword;
	public static Toolssword legacy_sword;
	public static Toolssword ninja_sword;
	public static Toolssword viking_sword;

	public static void newtools() {
		angel_sword = new Toolssword(angelP, "angel_sword", LegacyMod.tabLegacy,  1);
		atom_sword = new Toolssword(angelP, "atom_sword", LegacyMod.tabLegacy,  1);
		legacy_sword = new Toolssword(angelP, "legacy_sword", LegacyMod.tabLegacy,  1);
		ninja_sword = new Toolssword(angelP, "ninja_sword", LegacyMod.tabLegacy,  1);
		viking_sword = new Toolssword(angelP, "viking_sword", LegacyMod.tabLegacy,  1);
//:new PotionEffect(Potion.moveSpeed.id, 1200, 1)
	}
	
	public static void recipe() {
		
		GameRegistry.addRecipe(new ItemStack(angel_sword), new Object[] { "A",
			"A", "S", 'A', LegacyItems.angel_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(atom_sword), new Object[] { "A",
			"A", "S", 'A', LegacyItems.atom_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(legacy_sword), new Object[] { "A",
			"A", "S", 'A', LegacyItems.legacy_gem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ninja_sword), new Object[] { "A",
			"A", "S", 'A', LegacyItems.ninja_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(viking_sword), new Object[] { "A",
			"A", "S", 'A', LegacyItems.viking_ingot, 'S', Items.stick });

	}

	public static void Render() {
		angel_sword.RegisterRenderer("angel_sword");
		atom_sword.RegisterRenderer("atom_sword");
		legacy_sword.RegisterRenderer("legacy_sword");
		ninja_sword.RegisterRenderer("ninja_sword");
		viking_sword.RegisterRenderer("viking_sword");

	}



}
