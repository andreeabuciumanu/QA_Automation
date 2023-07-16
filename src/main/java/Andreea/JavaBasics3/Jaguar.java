package Andreea.JavaBasics3;

public class Jaguar extends Animal implements WildAnimals {
    @Override
    public boolean hasEyes() {
        return false;
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void canWalk() {

    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void goHunt() {
        System.out.println("Jaguar goes to hunt");

    }

    @Override
    public void lickWounds() {

    }

    @Override
    public Cat returnObject() {
        return new Cat();
    }
}
