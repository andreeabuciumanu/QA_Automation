package Andreea.OOPExercises;

public class A {

    void merge(){
        System.out.println("Merge");
    }
    A(){
        this(1);
        System.out.println("M");
        }


    A(int i){
        System.out.println("N");
    }
}
class B extends A{
    B() {
        super();
    }
}
class TestB{
    public static void main(String[] args) {
        B object = new B();
        object.merge();


    }


}
