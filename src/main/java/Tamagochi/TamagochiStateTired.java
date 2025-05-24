package Tamagochi;

public class TamagochiStateTired implements TamagochiState{

    @Override
    public TamagochiState play() {
        return this;
    }

    @Override
    public TamagochiState eat() {
        return new TamagochiStateHappy();
    }

    @Override
    public TamagochiState sleep() {
        return new TamagochiStateHappy();
    }
}
