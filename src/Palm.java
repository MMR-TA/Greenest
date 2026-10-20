// Arv där extends gör att klassen ärver gemensamma egenskaper från Plant superklassen.
// polymorfism där klassen impplementerar egna versioner av metoderna
// som anropas via en referens av typen Plant
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
