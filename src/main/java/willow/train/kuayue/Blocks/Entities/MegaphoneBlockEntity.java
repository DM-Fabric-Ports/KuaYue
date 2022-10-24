package willow.train.kuayue.Blocks.Entities;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import willow.train.kuayue.Blocks.MegaPhoneBlock;
import willow.train.kuayue.init.BlockEntitiesInit;
import willow.train.kuayue.sounds.ModSounds;


public class MegaphoneBlockEntity extends BlockEntity {
    //public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
    private int timer;
    public MegaphoneBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntitiesInit.MEGAPHONE_BLOCK_ENTITIES.get(), pPos, pBlockState);
        this.timer = 0;
    }
    public static void tick(Level level, BlockPos blockPos, BlockState blockState, MegaphoneBlockEntity entity) {
        if(!level.isClientSide()){
            entity.timer--;
            if(entity.timer <= 0) {
                entity.timer = 24;
                //LOGGER.info(Integer.toString(entity.timer));
                if(blockState.getValue(MegaPhoneBlock.POWERED)) {
                    level.playSound(null, blockPos ,ModSounds.CROSSING_RINGING.get(), SoundSource.BLOCKS, 10f, 1f);
                }
            }
        }
    }
}
