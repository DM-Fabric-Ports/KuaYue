package willow.train.kuayue.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import willow.train.kuayue.Util.HorizontalBlockBase;
import willow.train.kuayue.sounds.ModSounds;

import java.util.Random;

public class MegaPhoneBlock extends HorizontalBlockBase {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final IntegerProperty TICK = IntegerProperty.create("time_tick",0,25);
    public MegaPhoneBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, Boolean.FALSE).setValue(TICK,24));
    }

    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
        boolean flag = pLevel.hasNeighborSignal(pPos);
        if (flag != pState.getValue(POWERED)) {
            if (flag) {
               //this.playNote(pLevel, pPos);
                pLevel.blockEvent(pPos, this, 0, 0);
            }
            pLevel.setBlock(pPos, pState.setValue(POWERED, Boolean.valueOf(flag)), 3);
        }

    }
    public void playNote(Level level, BlockPos pos) {
        level.playSound((Player) null, pos, ModSounds.CROSSING_RINGING.get(), SoundSource.BLOCKS, 10F, 1f);
    }

    @Override
    public void animateTick(BlockState pState,  Level pLevel,  BlockPos pPos, Random pRandom) {

    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        if(pState.getValue(POWERED)){

            int mTick =  pState.getValue(TICK);
            pLevel.addParticle(ParticleTypes.NOTE, (double)pPos.getX() +1d, (double)pPos.getY() + 1.2D, (double)pPos.getZ() + 0.5D, (double)1 / 24.0D, 0.0D, 0.0D);
            if( mTick > 1 ) {
                 pLevel.addParticle(ParticleTypes.NOTE, (double)pPos.getX() -(double)mTick, (double)pPos.getY() + 1.2D, (double)pPos.getZ() + 0.5D, (double)1 / 24.0D, 0.0D, 0.0D);
                pLevel.setBlock(pPos,pState.setValue(TICK,mTick- 1),2);
            }
            else{

                //this.playNote(pLevel, pPos);
                pLevel.addParticle(ParticleTypes.NOTE, (double)pPos.getX() , (double)pPos.getY() + 2D, (double)pPos.getZ() + 0.5D, (double)1 / 24.0D, 0.0D, 0.0D);
                pLevel.blockEvent(pPos, this, 0, 0);
                pLevel.setBlock(pPos,pState.setValue(TICK,5),2);

            }
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.isClientSide) {

            return InteractionResult.SUCCESS;

        } else {
            pLevel.blockEvent(pPos, this, 0, 0);
            return InteractionResult.CONSUME;
        }
    }

    @Override
    public boolean triggerEvent(BlockState pState, Level pLevel, BlockPos pPos, int pId, int pParam) {
            //playNote(pLevel, pPos);
        pLevel.playLocalSound(pPos.getX(), pPos.getY(), pPos.getZ(), ModSounds.CROSSING_RINGING.get(), SoundSource.BLOCKS, 10f, 1f, false);

        pLevel.addParticle(ParticleTypes.NOTE, (double)pPos.getX() + 0.5D, (double)pPos.getY() + 1.2D, (double)pPos.getZ() + 0.5D, (double)1 / 24.0D, 0.0D, 0.0D);
            return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING,POWERED,TICK);
    }
}