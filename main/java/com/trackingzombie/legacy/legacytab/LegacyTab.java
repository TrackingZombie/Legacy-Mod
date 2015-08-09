package com.trackingzombie.legacy.legacytab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.trackingzombie.legacy.LegacyBlocksandItems.LegacyItems;

public class LegacyTab extends CreativeTabs{

		public LegacyTab(String label) {
			super(label);
		}

		@Override
		public Item getTabIconItem() {
			return LegacyItems.legacy_gem;
			
		}

	}
