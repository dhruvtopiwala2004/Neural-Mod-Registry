
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

        int speedCompare = Double.compare(
                this.processingSpeed, other.processingSpeed);

        if (speedCompare != 0) {
            return speedCompare;
        }

        int compatibilityCompare = Integer.compare(
                other.compatibilityRating, this.compatibilityRating);

        if (compatibilityCompare != 0) {
            return compatibilityCompare;
        }

        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Speed: " + processingSpeed
                + ", Compatibility: " + compatibilityRating;
    }
}
