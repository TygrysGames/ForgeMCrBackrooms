package com.tg.forgebackroomsplus.procedures;

import net.minecraft.world.entity.Entity;

import com.tg.forgebackroomsplus.network.ForgeBackroomsPlusModVariables;

public class SanityConv6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic = false;
		if ((entity.getCapability(ForgeBackroomsPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgeBackroomsPlusModVariables.PlayerVariables())).stamina == 6) {
			return true;
		}
		return false;
	}
}
