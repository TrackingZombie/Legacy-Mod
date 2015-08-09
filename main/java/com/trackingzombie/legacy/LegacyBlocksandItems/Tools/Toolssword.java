package com.trackingzombie.legacy.LegacyBlocksandItems.Tools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.trackingzombie.legacy.Reference;

public class Toolssword extends ItemSword {

	public Toolssword(ToolMaterial material, String name,
			CreativeTabs creativetab, int maxstacksize) {
		super(material);

		this.setUnlocalizedName(name);
		this.setCreativeTab(creativetab);
		this.setMaxStackSize(maxstacksize);// = 1 by vanila code!...unless specified otherwise...Note: All tools stack to 1 when damaged...this line is useless/not-needed.
		System.out.println("INITIALIZING ITEM: " + name);

		GameRegistry.registerItem(this, name);

	}

	public boolean hitEntity(ItemStack par1ItemStack,
			EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
		int howManyTicks = 10;
		par2EntityLiving.addPotionEffect(new PotionEffect(
				Potion.wither.getId(), 30 * howManyTicks, 0));
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}

	public void RegisterRenderer(String modelName) {
		System.out.println("REGISTERING ITEM RENDERER: " + modelName);

		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						this,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ modelName, "inventory"));
	}
}
