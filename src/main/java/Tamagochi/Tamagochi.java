package Tamagochi;

public class Tamagochi {

    private String name;
    private TamagochiState currentState;

    public Tamagochi(String name) {
        this.name = name;
        currentState = new TamagochiStateHappy();
    }
}
