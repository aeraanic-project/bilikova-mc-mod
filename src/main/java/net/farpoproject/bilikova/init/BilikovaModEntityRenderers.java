
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.farpoproject.bilikova.client.renderer.TucnytestRenderer;
import net.farpoproject.bilikova.client.renderer.NemecRenderer;
import net.farpoproject.bilikova.client.renderer.JeskovaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BilikovaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BilikovaModEntities.TUCNYTEST.get(), TucnytestRenderer::new);
		event.registerEntityRenderer(BilikovaModEntities.NEMEC.get(), NemecRenderer::new);
		event.registerEntityRenderer(BilikovaModEntities.JESKOVA.get(), JeskovaRenderer::new);
	}
}
