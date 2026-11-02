public class NeuralMod implements Comparable<NeuralMod> {
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
    public int compareTo(NeuralMod other) {
        return Double.compare(this.processingSpeed,
                other.processingSpeed);
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Speed: " + processingSpeed
                + ", Compatibility: " + compatibilityRating;
    }
}
