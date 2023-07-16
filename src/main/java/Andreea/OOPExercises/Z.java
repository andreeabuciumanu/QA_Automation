package Andreea.OOPExercises;

public class Z {
    void greet() {
        System.out.println("Good morning");
    }


}
    class C extends Z {
        @Override
        void greet() {
            System.out.println("Good afternoon!");
        }


        void adunare(){
            System.out.println("adunare");
        }
    }

    class T extends C {
        @Override
        void greet() {
            System.out.println("Good night!");
        }

    }

    class TestZ {
        public static void main(String[] args) {
            Z z = new T();
            z.greet();
            ((T)z).adunare();
            ((T)z).greet();
            ((C)z).greet();




        }
    }

