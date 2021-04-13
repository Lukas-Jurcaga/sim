package animals;

import javax.crypto.interfaces.DHPrivateKey;

public class Simran extends Animal{

    public Simran(){
        compatibleAnimals = new Animal[]{new Seal()};
        nickName = "cunt";
    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        int i = 0;
        while(!(animal.getClass().equals(compatibleAnimals[i].getClass()))){
            i++;
            if (i > compatibleAnimals.length){
                return false;
            }
        }
        return true;
    }

}
