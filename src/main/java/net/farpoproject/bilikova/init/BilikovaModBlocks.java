
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.farpoproject.bilikova.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.farpoproject.bilikova.block.ZelenaStenaBlock;
import net.farpoproject.bilikova.block.BrizoliiVonkoBlock;
import net.farpoproject.bilikova.BilikovaMod;

public class BilikovaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BilikovaMod.MODID);
	public static final RegistryObject<Block> ZELENA_STENA = REGISTRY.register("zelena_stena", () -> new ZelenaStenaBlock());
	public static final RegistryObject<Block> BRIZOLII_VONKO = REGISTRY.register("brizolii_vonko", () -> new BrizoliiVonkoBlock());
}
