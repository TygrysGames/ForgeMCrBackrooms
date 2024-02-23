
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.tg.forgebackroomsplus.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeBackroomsPlusModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> SANITY_RANDOM_TICK = GameRules.register("sanityRandomTick", GameRules.Category.PLAYER, GameRules.IntegerValue.create(10000));
}
