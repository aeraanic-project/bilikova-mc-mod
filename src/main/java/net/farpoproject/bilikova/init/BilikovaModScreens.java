
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.farpoproject.bilikova.client.gui.TucnytradingguyScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BilikovaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BilikovaModMenus.TUCNYTRADINGGUY, TucnytradingguyScreen::new);
		});
	}
}
