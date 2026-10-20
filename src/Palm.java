public class Palm extends Plant{


    public Palm(String name, float length) {
        super(name, length);
    }

    @Override
    public float calculateFluidNeeds() {
        return 0.5f * getLength();
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.TAP_WATER;
    }
}
