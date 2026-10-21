public enum FluidType {
    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String showFluidType;

    FluidType(String showFluidType) {
        this.showFluidType = showFluidType;
    }

    @Override
    public String toString() {
        return showFluidType;
    }
}
