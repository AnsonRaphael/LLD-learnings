package com.nanos.creational.builderDP;

public class GamimgComputerH extends ComputerH{
    private boolean hasCoolingSystem;
    protected GamimgComputerH(GamimngComputerHBuilder builder) {
        super(builder);
        this.hasCoolingSystem = builder.hasCoolingSystem;
    }

    public static class GamimngComputerHBuilder extends ComputerH.ComputerHBuilder<GamimngComputerHBuilder>{
        private boolean hasCoolingSystem;

        public GamimngComputerHBuilder withCoolingSystem(boolean hasCoolingSystem) {
            this.hasCoolingSystem = hasCoolingSystem;
            return this;
        }

        @Override
        public GamimgComputerH build() {
            return new GamimgComputerH(this);
        }

        @Override
        protected GamimngComputerHBuilder self() {
            return this;
        }

    }

    @Override
    public String toString() {
        String data = super.toString();
        return data+" GamimgComputerH{" +
                "hasCoolingSystem=" + hasCoolingSystem +
                '}';
    }
}
