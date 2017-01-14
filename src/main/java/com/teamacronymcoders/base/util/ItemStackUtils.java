package com.teamacronymcoders.base.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ItemStackUtils {
	private ItemStackUtils() {}

	public static boolean isSmeltable(ItemStack itemStack) {
		return itemStack != null && FurnaceRecipes.instance().getSmeltingResult(itemStack) != null;
	}

	public static boolean isItemInstanceOf(ItemStack itemStack, Class itemClass) {
		return itemStack != null && itemClass != null && itemClass.isInstance(itemStack.getItem());
	}

	public static boolean doItemsMatch(ItemStack itemStack, Item item) {
		return itemStack != null && itemStack.getItem() == item;
	}

	public static boolean isItemNonNull(ItemStack itemStack) {
		return itemStack != null && itemStack.getItem() != null;
	}
}
