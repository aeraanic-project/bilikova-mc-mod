
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.farpoproject.bilikova.client.model.Modeltucny;
import net.farpoproject.bilikova.client.model.Modelnomodel;
import net.farpoproject.bilikova.client.model.Modelnemec;
import net.farpoproject.bilikova.client.model.Modeljeskova;
import net.farpoproject.bilikova.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BilikovaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltucny.LAYER_LOCATION, Modeltucny::createBodyLayer);
		event.registerLayerDefinition(Modelnemec.LAYER_LOCATION, Modelnemec::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modeljeskova.LAYER_LOCATION, Modeljeskova::createBodyLayer);
		event.registerLayerDefinition(Modelnomodel.LAYER_LOCATION, Modelnomodel::createBodyLayer);
	}
}
