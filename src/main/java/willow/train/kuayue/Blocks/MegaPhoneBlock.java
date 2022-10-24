package willow.train.kuayue.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import willow.train.kuayue.Blocks.Entities.MegaphoneBlockEntity;
import willow.train.kuayue.init.BlockEntitiesInit;
import willow.train.kuayue.sounds.ModSounds;

public class MegaPhoneBlock extends BaseEntityBlock {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public MegaPhoneBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public void neighborChanged(BlockState pState, Level pLevel, @NotNull BlockPos pPos, @NotNull Block pBlock, @NotNull BlockPos pFromPos, boolean pIsMoving) {
        boolean flag = pLevel.hasNeighborSignal(pPos);
            pLevel.setBlock(pPos, pState.setValue(POWERED, flag), 2);
        }
    public BlockState rotate(BlockState p_54360_, Rotation p_54361_) {
        return p_54360_.setValue(FACING, p_54361_.rotate(p_54360_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_54357_, Mirror p_54358_) {
        return p_54357_.rotate(p_54358_.getRotation(p_54357_.getValue(FACING)));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING,context.getHorizontalDirection()).setValue(POWERED,false);

    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING,POWERED);
    }


    @Override
    public @NotNull InteractionResult use(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        if (pLevel.isClientSide) {

            return InteractionResult.SUCCESS;

        } else {
            pLevel.blockEvent(pPos, this, 0, 0);
            return InteractionResult.CONSUME;
        }
    }

    @Override
    public boolean triggerEvent(@NotNull BlockState pState, Level pLevel, BlockPos pPos, int pId, int pParam) {
        pLevel.playLocalSound(pPos.getX(), pPos.getY(), pPos.getZ(), ModSounds.CROSSING_RINGING.get(), SoundSource.BLOCKS, 10f, 1f, false);

        pLevel.addParticle(ParticleTypes.NOTE, (double)pPos.getX() + 0.5D, (double)pPos.getY() + 1.2D, (double)pPos.getZ() + 0.5D, (double)1 / 24.0D, 0.0D, 0.0D);
            return true;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MegaphoneBlockEntity(pPos,pState);
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType,BlockEntitiesInit.MEGAPHONE_BLOCK_ENTITIES.get(), MegaphoneBlockEntity::tick);
    }
}