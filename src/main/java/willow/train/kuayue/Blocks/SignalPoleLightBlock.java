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

public class SignalPoleLightBlock extends HorizontalBlockBase {

    public SignalPoleLightBlock(Properties p_49795_) {
        super(p_49795_);
    }//0.75,0,11.25,11.75,16,18.75

    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(-2.75,0,0.25,4.75,32,11.25));
    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(4.25,0,-2.75,15.25,32,2.75));
    protected static final VoxelShape NORTH_AABB = Shapes.or(Block.box(11.25,0,4.25,18.75,32,15.25));
    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(0.75,0,11.25,11.75,32,18.75));


    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        switch ((Direction) p_54372_.getValue(FACING)) {
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
