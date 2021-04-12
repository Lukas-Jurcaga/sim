package animals;

public class Seal extends Animal{
    public Seal(){
    }

    @Override
    public String getNickname() {
        return null;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return false;
    }
}
