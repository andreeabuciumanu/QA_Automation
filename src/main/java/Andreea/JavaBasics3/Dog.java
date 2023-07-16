package Andreea.JavaBasics3;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Barks! ham ham");
    }

    @Override
    public void canWalk() {
        System.out.println("Going for a walk");

    }

    @Override
    public boolean canFly() {
        return false;
    }
}
