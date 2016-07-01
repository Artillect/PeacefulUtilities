package com.artillect.peacefulutilities.init;

import com.artillect.peacefulutilities.item.ItemPUtils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemPUtils seedFlax;
	
	public static void init() {
		seedFlax = register(new ItemPUtils("seedFlax").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemPUtils) {
			((ItemPUtils)item).registerItemModel();
		}

		return item;
	}

}