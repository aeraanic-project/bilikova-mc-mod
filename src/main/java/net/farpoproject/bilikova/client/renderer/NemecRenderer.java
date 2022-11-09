
package net.farpoproject.bilikova.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.farpoproject.bilikova.entity.NemecEntity;
import net.farpoproject.bilikova.client.model.Modelnemec;

public class NemecRenderer extends MobRenderer<NemecEntity, Modelnemec<NemecEntity>> {
	public NemecRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnemec(context.bakeLayer(Modelnemec.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NemecEntity entity) {
		return new ResourceLocation("bilikova:textures/entities/benmcsf.png");
	}
}
