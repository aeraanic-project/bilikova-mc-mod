
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.farpoproject.bilikova.block.ZelenaStenaBlock;
import net.farpoproject.bilikova.block.PodlahaBlock;
import net.farpoproject.bilikova.block.LampaBlock;
import net.farpoproject.bilikova.block.DlazdicaBlock;
import net.farpoproject.bilikova.block.BrizoliiVonkoBlock;
import net.farpoproject.bilikova.block.BilikoblockBlock;
import net.farpoproject.bilikova.block.APodlahaBlock;
import net.farpoproject.bilikova.BilikovaMod;

public class BilikovaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BilikovaMod.MODID);
	public static final RegistryObject<Block> ZELENA_STENA = REGISTRY.register("zelena_stena", () -> new ZelenaStenaBlock());
	public static final RegistryObject<Block> BRIZOLII_VONKO = REGISTRY.register("brizolii_vonko", () -> new BrizoliiVonkoBlock());
	public static final RegistryObject<Block> BILIKOBLOCK = REGISTRY.register("bilikoblock", () -> new BilikoblockBlock());
	public static final RegistryObject<Block> DLAZDICA = REGISTRY.register("dlazdica", () -> new DlazdicaBlock());
	public static final RegistryObject<Block> PODLAHA = REGISTRY.register("podlaha", () -> new PodlahaBlock());
	public static final RegistryObject<Block> A_PODLAHA = REGISTRY.register("a_podlaha", () -> new APodlahaBlock());
	public static final RegistryObject<Block> LAMPA = REGISTRY.register("lampa", () -> new LampaBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			LampaBlock.registerRenderLayer();
		}
	}
}
