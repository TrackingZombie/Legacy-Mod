package com.trackingzombie.legacy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.trackingzombie.legacy.CustomTemplates.CustomItems;
import com.trackingzombie.legacy.Proxy.CommonProxy;
import com.trackingzombie.legacy.legacytab.LegacyTab;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, dependencies = "required-after:FML")
public class LegacyMod {
	
	
	public static final LegacyTab tabLegacy = new LegacyTab("tabLegacy");

	@SidedProxy(modId = Reference.MODID, clientSide = Reference.Client_PROXY, serverSide = Reference.Server_PROXY)
	public static CommonProxy proxy;

	@Instance(value = Reference.MODID)
	public static LegacyMod instance;
	public static CustomItems Sulfur;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) 
	{

		
		proxy.preinit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		proxy.init(event);
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) 
	{
		proxy.postinit(event);
	}

}
