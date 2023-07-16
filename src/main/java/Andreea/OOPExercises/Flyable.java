package Andreea.OOPExercises;

public interface Flyable {


    static int horizontalDegree(){
        return 20;

    }

    default void fly(){
        System.out.println("Flying at " + horizontalDegree() + "degree");
    }

    void land();

}
class Aeroplane implements Flyable {
    @Override
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + "degree");
    }


    public static void main(String[] args) {
        Aeroplane plane = new Aeroplane();
        plane.fly();
        plane.land();

    }

}

