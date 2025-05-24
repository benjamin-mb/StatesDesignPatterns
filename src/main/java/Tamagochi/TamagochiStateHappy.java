package Tamagochi;

public class TamagochiStateHappy implements TamagochiState{

    @Override
    public TamagochiState play() {
        return this;
    }

    @Override
    public TamagochiState eat() {
        return new TamagochiStateTired();
    }

    @Override
    public TamagochiState sleep() {
        return new TamagochyStateHungry();
    }
}
