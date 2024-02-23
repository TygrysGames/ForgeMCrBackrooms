package com.tg.forgebackroomsplus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.tg.forgebackroomsplus.init.ForgeBackroomsPlusModBlocks;

public class CorrupterAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).isEmpty()) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z + 8))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_CEILING.get())) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z + 8))).getBlock() == ForgeBackroomsPlusModBlocks.ROOM_GENERATOR.get())) {
					if (!((world.getBlockState(BlockPos.containing(x, y, z + 8))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR_WET.get())) {
						if (!((world.getBlockState(BlockPos.containing(x, y, z + 8))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR.get())) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, (z + 8)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ forge_backrooms_plus:corrupter");
						}
					}
				}
			}
			if (!((world.getBlockState(BlockPos.containing(x, y, z - 8))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_CEILING.get())) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z - 8))).getBlock() == ForgeBackroomsPlusModBlocks.ROOM_GENERATOR.get())) {
					if (!((world.getBlockState(BlockPos.containing(x, y, z - 8))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR_WET.get())) {
						if (!((world.getBlockState(BlockPos.containing(x, y, z - 8))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR.get())) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, (z - 8)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ forge_backrooms_plus:corrupter");
						}
					}
				}
			}
			if (!((world.getBlockState(BlockPos.containing(x + 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_CEILING.get())) {
				if (!((world.getBlockState(BlockPos.containing(x + 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.ROOM_GENERATOR.get())) {
					if (!((world.getBlockState(BlockPos.containing(x + 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR_WET.get())) {
						if (!((world.getBlockState(BlockPos.containing(x + 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR.get())) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 8), y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ forge_backrooms_plus:corrupter");
						}
					}
				}
			}
			if (!((world.getBlockState(BlockPos.containing(x - 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_CEILING.get())) {
				if (!((world.getBlockState(BlockPos.containing(x - 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.ROOM_GENERATOR.get())) {
					if (!((world.getBlockState(BlockPos.containing(x - 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR_WET.get())) {
						if (!((world.getBlockState(BlockPos.containing(x - 8, y, z))).getBlock() == ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR.get())) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x - 8), y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ forge_backrooms_plus:corrupter");
						}
					}
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 190, 190, 190), e -> true).isEmpty()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"setblock ~ ~ ~ forge_backrooms_plus:room_generator");
			}
		}
	}
}
