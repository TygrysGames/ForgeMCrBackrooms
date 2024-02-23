
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.tg.forgebackroomsplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.tg.forgebackroomsplus.ForgeBackroomsPlusMod;

public class ForgeBackroomsPlusModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ForgeBackroomsPlusMod.MODID);
	public static final RegistryObject<SoundEvent> BR_LAMP = REGISTRY.register("br.lamp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forge_backrooms_plus", "br.lamp")));
}
