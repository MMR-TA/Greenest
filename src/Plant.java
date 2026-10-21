// En abstrakt bassklass som samlar gemensamma egenskaper för alla växter.
// implements waterable innebär att klassen följer interfacets kontrakt.
public abstract class Plant implements Waterable {
    // inkapsliing där fälten är privata och nås via getters.
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


