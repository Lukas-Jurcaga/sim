package animals;

public class Parrot extends Animal{
    private final static Animal[] DEFAULT_COMPATIBLE_ANIMALS = new Animal[]{};
    private String nickName;
    private Animal[] compatibleAnimals;

    public Parrot(){
        compatibleAnimals = DEFAULT_COMPATIBLE_ANIMALS;
        nickName = "Parrot";
    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        if(!(animal.getClass().equals(this.getClass()))){
            if (compatibleAnimals.length <= 0){
                return false;
            }
            int i = 0;
            while(!(animal.getClass().equals(compatibleAnimals[i].getClass()))){
                i++;
                if (i >= compatibleAnimals.length){
                    return false;
                }
            }
        }
        return true;
    }
}
