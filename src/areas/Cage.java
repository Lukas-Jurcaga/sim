package areas;

import animals.Animal;

import java.util.ArrayList;

public class Cage extends Habitat implements IArea{

    public Cage(){
        super(HabitatConstants.CAGE.getMaxAnimals(),HabitatConstants.CAGE.getHabitableAnimals());
    }

    public Cage(int maxAnimals, Animal[] habitableAnimals) {
        super(maxAnimals, habitableAnimals);
    }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }
}
