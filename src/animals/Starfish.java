package animals;

public class Starfish extends Animal{
    @Override
    public String getNickname() {
        return null;
    }

    @Override
    public boolean isCompatibleWith(Animal animal) {
        return false;
    }
}
