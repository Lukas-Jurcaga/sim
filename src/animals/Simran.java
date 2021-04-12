package animals;

import javax.crypto.interfaces.DHPrivateKey;

public class Simran extends Animal{
    private String nickName;
    private Class compatibleWith[] = {Seal.class};
    //private Class compatibleWith;

    public Simran(){
        nickName = "cunt";
    }

    @Override
    public String getNickname() {
        return nickName;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        int i = 0;
        boolean compatible;
        for (Class c : compatibleWith) {
            compatible = animal instanceof c;
        }
    }

}
