package willow.train.kuayue.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class TactilePavingBlock extends HorizontalBlockBase {

    public TactilePavingBlock(Properties p_49795_) {
        super(p_49795_);
    }//8,0,6,19,32,8

    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(0,0,0,16,2,16));

    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        switch ((Direction) p_54372_.getValue(FACING)) {
            case NORTH:
                return SOUTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return SOUTH_AABB;
            case EAST:
            default:
                return SOUTH_AABB;
        }
    }
}
