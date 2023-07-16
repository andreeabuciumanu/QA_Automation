package Andreea.OOPExercises;

public class Super {

    public String num = "10";

}
class Sub extends Super{

//    public int num = 20;
    public String num = "100";
}
class TestSuper{
    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.num+=2);
        System.out.println(((Sub)obj).num+=2);
    }
}