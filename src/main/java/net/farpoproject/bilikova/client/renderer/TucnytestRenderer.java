
package net.farpoproject.bilikova.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.farpoproject.bilikova.entity.TucnytestEntity;
import net.farpoproject.bilikova.client.model.Modeltucny;

public class TucnytestRenderer extends MobRenderer<TucnytestEntity, Modeltucny<TucnytestEntity>> {
	public TucnytestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltucny(context.bakeLayer(Modeltucny.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TucnytestEntity entity) {
		return new ResourceLocation("bilikova:textures/entities/texture.png");
	}
}
