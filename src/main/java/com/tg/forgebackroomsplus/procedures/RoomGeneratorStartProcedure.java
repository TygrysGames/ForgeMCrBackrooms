package com.tg.forgebackroomsplus.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import com.tg.forgebackroomsplus.init.ForgeBackroomsPlusModEntities;

public class RoomGeneratorStartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() > 0.9) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z - 4), BlockPos.containing(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.45) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z - 4), BlockPos.containing(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() <= 0.3) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z + 4), BlockPos.containing(x + 4, y, z + 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() >= 0.7) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z - 4), BlockPos.containing(x + 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() <= 0.4) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z + 4), BlockPos.containing(x - 4, y, z + 4),
							new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() > 0.9) {
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z + 4), BlockPos.containing(x + 4, y, z + 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() > 0.94) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z - 4), BlockPos.containing(x + 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() > 0.89) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z + 4), BlockPos.containing(x - 4, y, z + 4),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z + 4), BlockPos.containing(x + 4, y, z + 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				if (Math.random() > 0.8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = ForgeBackroomsPlusModEntities.BACTERIA.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
		} else {
			if (Math.random() > 0.8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z - 4), BlockPos.containing(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() > 0.8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z - 4), BlockPos.containing(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "level0_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y, z - 4), BlockPos.containing(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forge_backrooms_plus", "backroomsportal"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -4, 4), x + 1, z + Mth.nextInt(RandomSource.create(), -4, 4)),
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -4, 4), x + 1, z + Mth.nextInt(RandomSource.create(), -4, 4)),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
	}
}
