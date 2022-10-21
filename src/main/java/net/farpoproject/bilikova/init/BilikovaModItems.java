
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.farpoproject.bilikova.BilikovaMod;

public class BilikovaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BilikovaMod.MODID);
	public static final RegistryObject<Item> TUCNYTEST = REGISTRY.register("tucnytest_spawn_egg",
			() -> new ForgeSpawnEggItem(BilikovaModEntities.TUCNYTEST, -10027162, -16724788, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
