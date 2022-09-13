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

import java.util.stream.Stream;

public class PantographBlock extends HorizontalBlockBase {
    private static VoxelShape shape;
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(0, 0, 0, 16, 1, 19),
            Block.box(6.5, 1, -2, 9.5, 16, 11),
            Block.box(2.5, 16, -2, 13.5, 24, 6),
            Block.box(-2.5, 24, 6, 18.5, 32, 13));
    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(-3, 0, 0, 16, 1, 16),
            Block.box(5, 1, 6.5, 18, 16, 9.5),
            Block.box(10, 16, 2.5, 18, 24, 13.5),
            Block.box(3, 24, -2.5, 10, 32, 18.5));
    protected static final VoxelShape NORTH_AABB = Shapes.or(
            Block.box(0, 0, -3, 16, 1, 16),
            Block.box(6.5, 1, 5, 9.5, 16, 18),
            Block.box(2.5, 16, 10, 13.5, 24, 18),
            Block.box(-2.5, 24, 3, 18.5, 32, 10));
    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(0, 0, 0, 19, 1, 16),
            Block.box(-2, 1, 6.5, 11, 16, 9.5),
            Block.box(-2, 16, 2.5, 6, 24, 13.5),
            Block.box(6, 24, -2.5, 13, 32, 18.5));

    public PantographBlock(Properties p_49795_) {
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
