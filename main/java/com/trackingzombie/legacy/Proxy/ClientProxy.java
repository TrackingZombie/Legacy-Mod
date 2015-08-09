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
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		LegacyBlocks.Render();
		LegacyItems.Render();
		LegacyTools.Render();

	}

	@Override
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}
}
