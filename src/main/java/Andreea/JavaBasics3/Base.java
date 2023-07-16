package Andreea.JavaBasics3;

public class Base {
        Cat cat = new Cat();


     static void print() {
        System.out.println("BASE");
    }
}

    class Derived extends Base{
          static void print() {
            System.out.println("DERIVED");


        }
    }

    class Test2{
        public static void main(String[] args) {
//            Base c = new Derived();
//            c.print();
//          nullPointerException -  cand se apeleaza o metoda de obiect de pe un obiect null
            Base b = null;
            Derived d = (Derived) b;
            System.out.println(b);
            System.out.println(d);
//            b.print();
            Base.print();
//            d.print();
            Derived.print();

        }
    }
