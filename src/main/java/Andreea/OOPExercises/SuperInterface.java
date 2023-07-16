package Andreea.OOPExercises;

public interface SuperInterface {

    String name = "SUPER";

}
interface SubInterface extends SuperInterface{

}
class TestInterface{
    public static void main(String[] args) {
        SubInterface sub = null;
//        System.out.println(sub.name);
        System.out.println(SubInterface.name);
    }
}