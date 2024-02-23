package com.tg.forgebackroomsplus.procedures;

import net.minecraft.world.entity.Entity;

import com.tg.forgebackroomsplus.network.ForgeBackroomsPlusModVariables;

public class SanityConv4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic = false;
		if ((entity.getCapability(ForgeBackroomsPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgeBackroomsPlusModVariables.PlayerVariables())).stamina == 4) {
			return true;
		}
		return false;
	}
}
