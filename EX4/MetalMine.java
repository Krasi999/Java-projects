package EX4;

class MetalMine extends BaseBuilding {
    public MetalMine() {
        super("Metal Mine", 1, 5, 100, 50, 0, 0);
    }

    @Override
    public void applyEffect(Planet target) {
        target.metal.harvestRate *= 2;
        System.out.println("Metal mine built on " + target.getName() + ". Metal harvest rate doubled.");
    }
}