package com.tg.forgebackroomsplus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import com.tg.forgebackroomsplus.network.ForgeBackroomsPlusModVariables;
import com.tg.forgebackroomsplus.init.ForgeBackroomsPlusModGameRules;

@Mod.EventBusSubscriber
public class SanityRunProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double stamina = 0;
		stamina = (entity.getCapability(ForgeBackroomsPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgeBackroomsPlusModVariables.PlayerVariables())).stamina;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("forge_backrooms_plus:is_that_heven"))).isDone()) {
			if (Mth.nextInt(RandomSource.create(), 1, (world.getLevelData().getGameRules().getInt(ForgeBackroomsPlusModGameRules.SANITY_RANDOM_TICK))) == 1) {
				if (!(stamina == 0)) {
					{
						double _setval = stamina - 1;
						entity.getCapability(ForgeBackroomsPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (stamina == 0) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("forge_backrooms_plus:sanity_damage")))), 4);
			}
		}
	}
}
