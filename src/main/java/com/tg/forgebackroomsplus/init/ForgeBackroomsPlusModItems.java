
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.tg.forgebackroomsplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.tg.forgebackroomsplus.item.BackroomsPotShardItem;
import com.tg.forgebackroomsplus.item.AlmondWaterItem;
import com.tg.forgebackroomsplus.item.AlmondPocketItem;
import com.tg.forgebackroomsplus.ForgeBackroomsPlusMod;

public class ForgeBackroomsPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgeBackroomsPlusMod.MODID);
	public static final RegistryObject<Item> LEVEL_1_FLOOR = block(ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR);
	public static final RegistryObject<Item> LEVEL_1_WALL = block(ForgeBackroomsPlusModBlocks.LEVEL_1_WALL);
	public static final RegistryObject<Item> LEVEL_1_WALL_DAMAGED = block(ForgeBackroomsPlusModBlocks.LEVEL_1_WALL_DAMAGED);
	public static final RegistryObject<Item> ALMOND_WATER = REGISTRY.register("almond_water", () -> new AlmondWaterItem());
	public static final RegistryObject<Item> BACKROOMS_CARPET = block(ForgeBackroomsPlusModBlocks.BACKROOMS_CARPET);
	public static final RegistryObject<Item> BACKROOMS_POT_SHARD = REGISTRY.register("backrooms_pot_shard", () -> new BackroomsPotShardItem());
	public static final RegistryObject<Item> BACKROOMS_POT = block(ForgeBackroomsPlusModBlocks.BACKROOMS_POT);
	public static final RegistryObject<Item> CRAFTED_BACKROOMS_POT = block(ForgeBackroomsPlusModBlocks.CRAFTED_BACKROOMS_POT);
	public static final RegistryObject<Item> LEVEL_1_FLOOR_WET = block(ForgeBackroomsPlusModBlocks.LEVEL_1_FLOOR_WET);
	public static final RegistryObject<Item> LEVEL_1_WALL_WET = block(ForgeBackroomsPlusModBlocks.LEVEL_1_WALL_WET);
	public static final RegistryObject<Item> LEVEL_1_LAMP = block(ForgeBackroomsPlusModBlocks.LEVEL_1_LAMP);
	public static final RegistryObject<Item> LEVEL_1_CEILING = block(ForgeBackroomsPlusModBlocks.LEVEL_1_CEILING);
	public static final RegistryObject<Item> ROOM_GENERATOR = block(ForgeBackroomsPlusModBlocks.ROOM_GENERATOR);
	public static final RegistryObject<Item> CORRUPTER = block(ForgeBackroomsPlusModBlocks.CORRUPTER);
	public static final RegistryObject<Item> PORTAL = block(ForgeBackroomsPlusModBlocks.PORTAL);
	public static final RegistryObject<Item> ALMOND_POCKET = REGISTRY.register("almond_pocket", () -> new AlmondPocketItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
