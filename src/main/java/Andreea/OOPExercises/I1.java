package Andreea.OOPExercises;

public interface I1 {

    int i = 10;

}

interface I2{
    int i = 15;
}

interface I3 extends I1, I2{
    int i = 25;
}

class TestMyInterface{
    public static void main(String[] args) {
        System.out.println(I1.i);
        System.out.println(I2.i);
        System.out.println(I3.i);
    }
}