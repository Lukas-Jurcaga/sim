package areas;

import animals.Animal;

import java.util.ArrayList;

public class Enclosure extends Habitat implements IArea{
    public Enclosure(){
        super(HabitatConstants.ENCLOSURE.getMaxAnimals(),HabitatConstants.ENCLOSURE.getHabitableAnimals());
    }

    public Enclosure(int maxAnimals, Animal[] habitableAnimals) {
        super(maxAnimals, habitableAnimals);
    }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }
}
