import animals.*;
import areas.Aquarium;
import areas.Cage;
import areas.Enclosure;
import areas.HabitatConstants;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Simran simran = new Simran();
        Seal seal = new Seal();
        Shark shark = new Shark();
        Starfish starfish = new Starfish();

        Buzzard buzzard = new Buzzard();
        Parrot parrot = new Parrot();

        Zebra zebra = new Zebra();
        Gazelle gazelle = new Gazelle();
        WhiteLion lion = new WhiteLion();


        Aquarium a1 = new Aquarium();
        Cage c1 = new Cage();
        Enclosure e1 = new Enclosure();

        Aquarium a2 = new Aquarium();
        Cage c2 = new Cage();
        Enclosure e2 = new Enclosure();

        a1.addAnimal(simran);
        a1.addAnimal(starfish);
        a1.addAnimal(seal);
        System.out.println(a1.addAnimal(seal));
        a2.addAnimal(shark);

        c1.addAnimal(buzzard);
        c2.addAnimal(parrot);
        c2.addAnimal(parrot);
        c2.addAnimal(parrot);
        System.out.println(c2.addAnimal(buzzard));

        e1.addAnimal(zebra);
        e1.addAnimal(gazelle);
        e2.addAnimal(lion);
        e2.addAnimal(lion);
        e2.addAnimal(lion);
        System.out.println(c2.addAnimal(lion));

        zoo.addArea(c1);
        zoo.addArea(e1);
        System.out.println(zoo.addAnimal(2, zebra));


        for(Animal animal: a1.getAnimals()){
            System.out.println("A1: " + animal.getNickname());
        }
        System.out.println();

        for(Animal animal: c1.getAnimals()){
            System.out.println("C1: " + animal.getNickname());
        }
        System.out.println();

        for(Animal animal: e1.getAnimals()){
            System.out.println("E1: " + animal.getNickname());
        }
        System.out.println();

        for(Animal animal: a2.getAnimals()){
            System.out.println("A2: " + animal.getNickname());
        }
        System.out.println();

        for(Animal animal: c2.getAnimals()){
            System.out.println("C2: " + animal.getNickname());
        }
        System.out.println();

        for(Animal animal: e2.getAnimals()){
            System.out.println("E2: " + animal.getNickname());
        }


    }
}
