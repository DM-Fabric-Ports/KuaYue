package willow.train.kuayue.Blocks.Supplier;

public interface IFakeDF11GBogey {
        void setForcedSpeed(float speed);
        void unsetForcedSpeed();
        default void setAngle(float angle) {}
        default float getAngle() {return 0f;}
        float getWheelRadius();
}
