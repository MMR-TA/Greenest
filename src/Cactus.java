public class Cactus extends Plant{

    public Cactus(String name, float length) {
        super(name, length);
    }

    @Override
    public float calculateFluidNeeds() {
        return 0.02f;
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.MINERAL_WATER;
    }
}
