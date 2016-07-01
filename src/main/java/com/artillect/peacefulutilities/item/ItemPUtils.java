package com.artillect.peacefulutilities.item;

import com.artillect.peacefulutilities.PeacefulUtilities;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPUtils extends Item {

	protected String name;

	public ItemPUtils(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	public void registerItemModel() {
		PeacefulUtilities.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemPUtils setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}