package com.tg.forgebackroomsplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import com.tg.forgebackroomsplus.init.ForgeBackroomsPlusModBlocks;

public class Level1StartProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, 200 - 1, z), ForgeBackroomsPlusModBlocks.CORRUPTER.get().defaultBlockState(), 3);
		{
			Entity _ent = entity;
			_ent.teleportTo(x, 200, z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, 200, z, _ent.getYRot(), _ent.getXRot());
		}
	}
}
