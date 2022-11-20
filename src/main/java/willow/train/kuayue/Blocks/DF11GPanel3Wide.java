package willow.train.kuayue.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class DF11GPanel3Wide extends HorizontalBlockBase {
    protected static final VoxelShape NORTH_AABB = Block.box(-16, 0, -0.25, 32, 16, 2);
    protected static final VoxelShape EAST_AABB = Block.box(14, 0, -16, 16.25, 16, 32);
    protected static final VoxelShape SOUTH_AABB = Block.box(-16, 0, 14, 32, 16, 16.25);
    protected static final VoxelShape WEST_AABB = Block.box(-0.25, 0, -16, 2, 16, 32);

    public DF11GPanel3Wide(Properties p_49795_) {
        super(p_49795_);
    }
    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        switch((Direction)p_54372_.getValue(FACING)) {
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
            default:
                return EAST_AABB;
        }
    }
}
