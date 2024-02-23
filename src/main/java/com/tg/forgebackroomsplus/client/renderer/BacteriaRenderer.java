
package com.tg.forgebackroomsplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.tg.forgebackroomsplus.entity.BacteriaEntity;
import com.tg.forgebackroomsplus.client.model.ModelBacteria;

public class BacteriaRenderer extends MobRenderer<BacteriaEntity, ModelBacteria<BacteriaEntity>> {
	public BacteriaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBacteria(context.bakeLayer(ModelBacteria.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BacteriaEntity entity) {
		return new ResourceLocation("forge_backrooms_plus:textures/entities/bacteria.png");
	}
}
