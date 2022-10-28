
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BilikovaModTabs {
	public static CreativeModeTab TAB_BILIKOVAITEMY;
	public static CreativeModeTab TAB_BILIKOVA_MOBOVIA;

	public static void load() {
		TAB_BILIKOVAITEMY = new CreativeModeTab("tabbilikovaitemy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.LIGHT_BLUE_BED);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BILIKOVA_MOBOVIA = new CreativeModeTab("tabbilikova_mobovia") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.GLOW_SQUID_SPAWN_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
