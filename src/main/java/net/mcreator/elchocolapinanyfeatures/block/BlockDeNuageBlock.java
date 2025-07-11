package net.mcreator.elchocolapinanyfeatures.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Direction;

public class BlockDeNuageBlock extends Block {
	public BlockDeNuageBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SNOW).strength(1f, 10f).requiresCorrectToolForDrops().noCollission());
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 5;
	}
}