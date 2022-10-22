
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.farpoproject.bilikova.BilikovaMod;

public class BilikovaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BilikovaMod.MODID);
	public static final RegistryObject<Item> TUCNYTEST = REGISTRY.register("tucnytest_spawn_egg",
			() -> new ForgeSpawnEggItem(BilikovaModEntities.TUCNYTEST, -10027162, -16724788,
					new Item.Properties().tab(BilikovaModTabs.TAB_BILIKOVA_MOBOVIA)));
	public static final RegistryObject<Item> ZELENA_STENA = block(BilikovaModBlocks.ZELENA_STENA, BilikovaModTabs.TAB_BILIKOVAITEMY);
	public static final RegistryObject<Item> BRIZOLII_VONKO = block(BilikovaModBlocks.BRIZOLII_VONKO, BilikovaModTabs.TAB_BILIKOVAITEMY);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
