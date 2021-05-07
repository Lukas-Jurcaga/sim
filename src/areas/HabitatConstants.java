package areas;

import animals.*;

public enum HabitatConstants {
    AQUARIUM(3, new Animal[]{new Seal(), new Shark(), new Starfish(), new Simran()}), CAGE(3, new Animal[]{new Buzzard(), new Parrot()}), ENCLOSURE(3, new Animal[]{new Zebra(), new WhiteLion(), new Gazelle()});

    private int maxAnimals;
    private Animal[] habitableAnimals;

    HabitatConstants(int maxAnimals, Animal[] habitableAnimals) {
        this.maxAnimals = maxAnimals;
        this.habitableAnimals = habitableAnimals;
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public Animal[] getHabitableAnimals() {
        return habitableAnimals;
    }
}
