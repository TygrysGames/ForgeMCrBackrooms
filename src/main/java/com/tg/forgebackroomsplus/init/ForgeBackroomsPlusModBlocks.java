
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.tg.forgebackroomsplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.tg.forgebackroomsplus.block.RoomGeneratorBlock;
import com.tg.forgebackroomsplus.block.PortalBlock;
import com.tg.forgebackroomsplus.block.Level1WallWetBlock;
import com.tg.forgebackroomsplus.block.Level1WallDamagedBlock;
import com.tg.forgebackroomsplus.block.Level1WallBlock;
import com.tg.forgebackroomsplus.block.Level1LampBlock;
import com.tg.forgebackroomsplus.block.Level1FloorWetBlock;
import com.tg.forgebackroomsplus.block.Level1FloorBlock;
import com.tg.forgebackroomsplus.block.Level1CeilingBlock;
import com.tg.forgebackroomsplus.block.CraftedBackroomsPotBlock;
import com.tg.forgebackroomsplus.block.CorrupterBlock;
import com.tg.forgebackroomsplus.block.BackroomsChestBlock;
import com.tg.forgebackroomsplus.block.BackroomsCarpetBlock;
import com.tg.forgebackroomsplus.ForgeBackroomsPlusMod;

public class ForgeBackroomsPlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgeBackroomsPlusMod.MODID);
	public static final RegistryObject<Block> LEVEL_1_FLOOR = REGISTRY.register("level_1_floor", () -> new Level1FloorBlock());
	public static final RegistryObject<Block> LEVEL_1_WALL = REGISTRY.register("level_1_wall", () -> new Level1WallBlock());
	public static final RegistryObject<Block> LEVEL_1_WALL_DAMAGED = REGISTRY.register("level_1_wall_damaged", () -> new Level1WallDamagedBlock());
	public static final RegistryObject<Block> BACKROOMS_CARPET = REGISTRY.register("backrooms_carpet", () -> new BackroomsCarpetBlock());
	public static final RegistryObject<Block> BACKROOMS_POT = REGISTRY.register("backrooms_pot", () -> new BackroomsChestBlock());
	public static final RegistryObject<Block> CRAFTED_BACKROOMS_POT = REGISTRY.register("crafted_backrooms_pot", () -> new CraftedBackroomsPotBlock());
	public static final RegistryObject<Block> LEVEL_1_FLOOR_WET = REGISTRY.register("level_1_floor_wet", () -> new Level1FloorWetBlock());
	public static final RegistryObject<Block> LEVEL_1_WALL_WET = REGISTRY.register("level_1_wall_wet", () -> new Level1WallWetBlock());
	public static final RegistryObject<Block> LEVEL_1_LAMP = REGISTRY.register("level_1_lamp", () -> new Level1LampBlock());
	public static final RegistryObject<Block> LEVEL_1_CEILING = REGISTRY.register("level_1_ceiling", () -> new Level1CeilingBlock());
	public static final RegistryObject<Block> ROOM_GENERATOR = REGISTRY.register("room_generator", () -> new RoomGeneratorBlock());
	public static final RegistryObject<Block> CORRUPTER = REGISTRY.register("corrupter", () -> new CorrupterBlock());
	public static final RegistryObject<Block> PORTAL = REGISTRY.register("portal", () -> new PortalBlock());
}
