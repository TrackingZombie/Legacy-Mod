package com.trackingzombie.legacy.Proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.trackingzombie.legacy.LegacyMod;
import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyBlocks;
import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyItems;
import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyTools;

public class ClientProxy extends CommonProxy {
	@Override
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		// preInit all blocks/items/custom tools
		LegacyBlocks.NewBlocks();
		LegacyTools.newtools();
		LegacyItems.normalitem();
		
		//Forgot to call registry for ore/block gen?...how do you think ore will spawn if this class is not called?
				
		
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		// Init Drops/recipe 
		LegacyBlocks.drops();		
		LegacyBlocks.recipe();
		LegacyItems.recipe();
		LegacyTools.recipe();
		
		//Render custom textures for blocks/items/tools
		LegacyBlocks.Render();
		LegacyItems.Render();
		LegacyTools.Render();
		
		//Register tileEntites here furnace...yes they need to be registerd in order for custom block with/out gui to work
		
		//Register GUI handler
		

	}

	@Override
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}
}
