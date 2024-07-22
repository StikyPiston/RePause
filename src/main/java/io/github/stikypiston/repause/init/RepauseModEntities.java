
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.stikypiston.repause.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import io.github.stikypiston.repause.RepauseMod;

public class RepauseModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RepauseMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FreezeGrenadeProjEntity>> FREEZE_GRENADE_PROJ = register("freeze_grenade_proj",
			EntityType.Builder.<FreezeGrenadeProjEntity>of(FreezeGrenadeProjEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
