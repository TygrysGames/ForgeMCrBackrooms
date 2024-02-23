
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.tg.forgebackroomsplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.tg.forgebackroomsplus.client.renderer.BacteriaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeBackroomsPlusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ForgeBackroomsPlusModEntities.BACTERIA.get(), BacteriaRenderer::new);
	}
}
