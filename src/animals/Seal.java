package animals;

public class Seal extends Animal{
    private final static Animal[] DEFAULT_COMPATIBLE_ANIMALS = new Animal[]{new Simran(), new Starfish()};
    private String nickName;
    private Animal[] compatibleAnimals;

    public Seal(){
        compatibleAnimals = DEFAULT_COMPATIBLE_ANIMALS;
        nickName = "Seal";
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
