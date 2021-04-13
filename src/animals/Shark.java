package animals;

public class Shark extends Animal{

    public Shark(){
        super.compatibleAnimals = new Animal[]{new Starfish()};
        nickName = "SHark";
    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        int i = 0;
        while(animal.getClass().equals(compatibleAnimals[i].getClass())){
            if (i == compatibleAnimals.length - 1){
                return false;
            }
        }
        return true;
    }
}
