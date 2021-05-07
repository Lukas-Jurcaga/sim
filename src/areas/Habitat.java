package areas;

import animals.Animal;
import zoo.Codes;

import java.util.ArrayList;

public abstract class Habitat {
    private ArrayList<Animal> animals;
    private int maxAnimals;
    private final Animal[] habitableAnimals;

    public Habitat(int maxAnimals, Animal[] habitableAnimals){
        this.maxAnimals = maxAnimals;
        this.habitableAnimals = habitableAnimals;
        animals = new ArrayList<>();
    }

    public byte addAnimal(Animal animal){

        if(!(isHabitableHere(animal))){
            return Codes.WRONG_HABITAT;
        }

        if (isFull()){
            return Codes.HABITAT_FULL;
        }

        if (!(isCompatibleWithInhabitants(animal))){
            return Codes.INCOMPATIBLE_INHABITANTS;
        }

        animals.add(animal);
        return Codes.ANIMAL_ADDED;
    }

    public boolean isFull(){
        return animals.size() >= maxAnimals;
    }

    public boolean isCompatibleWithInhabitants(Animal animalToCheck){
        for(Animal animal: animals){
            if(!(animal.isCompatibleWith(animalToCheck))){
                return false;
            }
        }
        return true;
    }

    public boolean isHabitableHere(Animal animal){
        int i = 0;
        while (!(habitableAnimals[i].getClass().equals(animal.getClass()))){
            i++;
            if(i >= habitableAnimals.length){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Animal> getAnimals(){
        return animals;
    }
}
