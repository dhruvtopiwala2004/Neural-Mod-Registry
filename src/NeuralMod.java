public class NeuralMod {
    String name;
    double processingSpeed;
    int compatibilityRating;

    public NeuralMod(String name, double processingSpeed,
                     int compatibilityRating) {
        this.name = name;
        this.processingSpeed = processingSpeed;
        this.compatibilityRating = compatibilityRating;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Speed: " + processingSpeed
                + ", Compatibility: " + compatibilityRating;
    }
}
