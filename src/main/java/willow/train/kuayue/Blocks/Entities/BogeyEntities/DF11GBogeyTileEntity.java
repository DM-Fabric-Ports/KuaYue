package willow.train.kuayue.Blocks.Entities.BogeyEntities;

import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.foundation.utility.animation.LerpedFloat;
import com.simibubi.create.foundation.utility.animation.LerpedFloat.Chaser;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import willow.train.kuayue.Util.IBogeyWheel;

public final class DF11GBogeyTileEntity extends KineticTileEntity implements IBogeyWheel {
	boolean hasForcedSpeed = false;
	public float forcedSpeed = 0;
	public LerpedFloat visualSpeed = LerpedFloat.linear();
	public float angle;

	public DF11GBogeyTileEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}

	@Override
	protected AABB createRenderBoundingBox() {
		return super.createRenderBoundingBox().inflate(2);
	}

	@Override
	public float getSpeed() {
		return hasForcedSpeed ? forcedSpeed : super.getSpeed();
	}

	@Override
	public void write(CompoundTag compound, boolean clientPacket) {
		super.write(compound, clientPacket);
	}

	@Override
	protected void read(CompoundTag compound, boolean clientPacket) {
		super.read(compound, clientPacket);
		if (clientPacket)
			visualSpeed.chase(getGeneratedSpeed(), 1 / 64f, Chaser.EXP);
	}

	@Override
	public void tick() {
		super.tick();

		if (!level.isClientSide)
			return;

		float targetSpeed = getSpeed();
		visualSpeed.updateChaseTarget(targetSpeed);
		visualSpeed.tickChaser();
		angle += visualSpeed.getValue() * 3 / 10f;
		angle %= 360;
	}

	@Override
	public void setForcedSpeed(float speed) {
		hasForcedSpeed = true;
		forcedSpeed = speed;
		visualSpeed.updateChaseTarget(speed);
		visualSpeed.tickChaser();
	}

	@Override
	public void unsetForcedSpeed() {
		hasForcedSpeed = false;
	}

	@Override
	public void setAngle(float angle) {
		this.angle = angle;
	}

	@Override
	public float getAngle() {
		return angle;
	}

	@Override
	public float getWheelRadius() {
		return 22.5f / 16;
	}
}
