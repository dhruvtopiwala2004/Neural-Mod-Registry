import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<NeuralMod> mods = new ArrayList<>();

        mods.add(new NeuralMod("Apex-1", 4.2, 85));
        mods.add(new NeuralMod("Zenith-X", 5.8, 70));
        mods.add(new NeuralMod("Nova-Core", 4.2, 92));
        mods.add(new NeuralMod("Soma-Link", 3.1, 98));
        mods.add(new NeuralMod("Pulse-7", 5.8, 60));

        Collections.sort(mods, new Comparator<NeuralMod>() {
            @Override
            public int compare(NeuralMod mod1, NeuralMod mod2) {
                return Integer.compare(mod2.compatibilityRating,
                        mod1.compatibilityRating);
            }
        });

        System.out.println("Mods Sorted by Compatibility:");

        for (NeuralMod mod : mods) {
            System.out.println(mod);
        }
    }
}
