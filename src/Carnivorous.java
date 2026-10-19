public class Carnivorous extends Plant {

    public Carnivorous(String name, float length) {
        super(name, length);
    }

    @Override
    public float calculateFluidNeeds() {
        return 0.1f + (0.2f * getLength());
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.PROTEIN_DRINK;
    }
}
