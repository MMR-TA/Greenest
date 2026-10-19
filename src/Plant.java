public abstract class Plant implements Watering {
    private final String name;
    private final float length;

    public Plant(String name, float length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public float getLength() {
        return length;
    }

    @Override
    public abstract float calculateFluidNeeds();

    public abstract FluidType getFluidType();
}


