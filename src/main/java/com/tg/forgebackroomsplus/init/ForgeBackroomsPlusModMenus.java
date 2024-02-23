
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.tg.forgebackroomsplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.tg.forgebackroomsplus.world.inventory.InvMenu;
import com.tg.forgebackroomsplus.ForgeBackroomsPlusMod;

public class ForgeBackroomsPlusModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForgeBackroomsPlusMod.MODID);
	public static final RegistryObject<MenuType<InvMenu>> INV = REGISTRY.register("inv", () -> IForgeMenuType.create(InvMenu::new));
}
