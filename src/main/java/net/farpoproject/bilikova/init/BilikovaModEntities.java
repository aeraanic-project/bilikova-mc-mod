
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.farpoproject.bilikova.entity.TucnytestEntity;
import net.farpoproject.bilikova.entity.NemecEntity;
import net.farpoproject.bilikova.entity.JeskovaEntity;
import net.farpoproject.bilikova.BilikovaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BilikovaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BilikovaMod.MODID);
	public static final RegistryObject<EntityType<TucnytestEntity>> TUCNYTEST = register("tucnytest",
			EntityType.Builder.<TucnytestEntity>of(TucnytestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TucnytestEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NemecEntity>> NEMEC = register("nemec",
			EntityType.Builder.<NemecEntity>of(NemecEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NemecEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JeskovaEntity>> JESKOVA = register("jeskova",
			EntityType.Builder.<JeskovaEntity>of(JeskovaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(JeskovaEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TucnytestEntity.init();
			NemecEntity.init();
			JeskovaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TUCNYTEST.get(), TucnytestEntity.createAttributes().build());
		event.put(NEMEC.get(), NemecEntity.createAttributes().build());
		event.put(JESKOVA.get(), JeskovaEntity.createAttributes().build());
	}
}
