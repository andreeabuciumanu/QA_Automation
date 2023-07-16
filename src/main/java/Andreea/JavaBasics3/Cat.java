package Andreea.JavaBasics3;

public class Cat extends Animal {

    private final String name;

    private final String race;

    protected String dateOfBirth;
    public static int counter;

    static{
        counter++;
        System.out.println("Static block is called");
    }

    {
        this.dateOfBirth = "15.06.2022";
        System.out.println("Date of birth was initialized");
    }

    {
        this.name = "Puffy";
        System.out.println("Name was initialized");
    }

    {
        this.race = "Persan";
        System.out.println("Race was initialized");

    }

    Cat(){

        System.out.println("Calling a constructor");
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
}
