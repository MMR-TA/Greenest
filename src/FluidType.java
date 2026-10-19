public enum FluidType {
    TAP_WATER("Kranvatten"),
    PROTEIN_DRINK("Proteindryck"),
    MINERAL_WATER("Mineralvatten");

    private final String showFluidType;

    FluidType(String showFluidType) {
        this.showFluidType = showFluidType;
    }

    @Override
    public String toString() {
        return showFluidType;
    }
}
