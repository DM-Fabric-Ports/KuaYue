package willow.train.kuayue.renderer;

import com.jozufozu.flywheel.core.PartialModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import com.simibubi.create.foundation.tileEntity.renderer.SafeTileEntityRenderer;
import com.simibubi.create.foundation.utility.AngleHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import willow.train.kuayue.Blocks.DF11GFrontBlock;
import willow.train.kuayue.Blocks.Entities.DF11GFrontTileEntity;
import willow.train.kuayue.init.AllModulePartials;

public class DF11GTileEntityRenderer extends SafeTileEntityRenderer<DF11GFrontTileEntity> {
    public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
    private int timer = 0;
    public DF11GTileEntityRenderer(BlockEntityRendererProvider.Context context) {
        
    }
    @Override
    protected void renderSafe(DF11GFrontTileEntity te, float partialTicks, PoseStack ms,
                              MultiBufferSource buffer, int light, int overlay) {
        VertexConsumer vb = buffer.getBuffer(RenderType.solid());

        BlockState blockState = te.getBlockState();
        Direction facing = te.getBlockState().getValue(DF11GFrontBlock.HORIZONTAL_FACING);
        //Direction.Axis facingAxis = facing.getAxis();
        //Direction.Axis axis = Direction.Axis.Y;
        timer++;
        if(timer>=20){
            LOGGER.info("facing angle:"+AngleHelper.horizontalAngle(facing)
            +"\nBS:"+te.getBlockState()
                    .getValue(DF11GFrontBlock.HORIZONTAL_FACING)+
                    "\nlight:"+light+
                    "\npartialTicks:"+partialTicks);
        }
        transformed(AllModulePartials.DF11_FRONT_BLOCK, blockState, facing)
                .unCentre()
                .light(light)
                .translate(0, 0, 0)
                .renderInto(ms, vb);
    }

    private SuperByteBuffer transformed(PartialModel model, BlockState blockState, Direction facing) {
        return CachedBufferer.partial(model, blockState)
                .centre()
                .rotateY(AngleHelper.horizontalAngle(facing));
    }
}
