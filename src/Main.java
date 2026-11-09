import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<NeuralMod> mods = new ArrayList<>();

        mods.add(new NeuralMod("Apex-1", 4.2, 85));
        mods.add(new NeuralMod("Zenith-X", 5.8, 70));
        mods.add(new NeuralMod("Nova-Core", 4.2, 92));
        mods.add(new NeuralMod("Soma-Link", 3.1, 98));
        mods.add(new NeuralMod("Pulse-7", 5.8, 60));

        Collections.sort(mods);

        System.out.println("Optimal Neural Mod Sorting:");

        for (NeuralMod mod : mods) {
            System.out.println(mod);
        }
    }
}
