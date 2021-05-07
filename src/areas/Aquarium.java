package areas;

import animals.*;

import java.util.ArrayList;

public class Aquarium extends Habitat implements IArea{

    public Aquarium(){
        super(HabitatConstants.AQUARIUM.getMaxAnimals(),HabitatConstants.AQUARIUM.getHabitableAnimals());
    }

    public Aquarium(int maxAnimals, Animal[] habitableAnimals) {
        super(maxAnimals, habitableAnimals);
    }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }
}
