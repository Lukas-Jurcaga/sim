import animals.Seal;
import animals.Simran;

public class Test {
    public static void main(String[] args) {
        Simran sim = new Simran();
        Seal johon = new Seal();
        System.out.println(sim.getNickname());
        System.out.println("Is simran compatible with a seal? " + sim.isCompatibleWith(johon));
    }
}
