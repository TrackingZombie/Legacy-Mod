package com.trackingzombie.legacy.Proxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.trackingzombie.legacy.LegacyMod;
import com.trackingzombie.legacy.CustomTemplates.CustomItems;
import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyBlocks;
import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyItems;
import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyTools;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
	}

	public void init(FMLInitializationEvent event) {
		LegacyBlocks.NewBlocks();
		LegacyBlocks.drops();
		LegacyItems.normalitem();
		LegacyBlocks.recipe();
		LegacyItems.recipe();
		LegacyTools.newtools();
		LegacyTools.recipe();
		

	}

	public void postinit(FMLPostInitializationEvent event) {

	}

}
