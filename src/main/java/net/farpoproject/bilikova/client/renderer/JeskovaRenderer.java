
package net.farpoproject.bilikova.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.farpoproject.bilikova.entity.JeskovaEntity;
import net.farpoproject.bilikova.client.model.Modeljeskova;

public class JeskovaRenderer extends MobRenderer<JeskovaEntity, Modeljeskova<JeskovaEntity>> {
	public JeskovaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljeskova(context.bakeLayer(Modeljeskova.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JeskovaEntity entity) {
		return new ResourceLocation("bilikova:textures/entities/jesj.png");
	}
}
