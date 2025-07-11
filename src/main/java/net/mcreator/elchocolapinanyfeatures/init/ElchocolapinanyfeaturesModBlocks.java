/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elchocolapinanyfeatures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.elchocolapinanyfeatures.block.BlockDeNuageBlock;
import net.mcreator.elchocolapinanyfeatures.ElchocolapinanyfeaturesMod;

import java.util.function.Function;

public class ElchocolapinanyfeaturesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ElchocolapinanyfeaturesMod.MODID);
	public static final DeferredBlock<Block> BLOCK_DE_NUAGE = register("block_de_nuage", BlockDeNuageBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}