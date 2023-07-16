package Andreea.JavaBasics1;

import java.util.Scanner;

public class ClasaTema1 {


    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        myVariables_ex5(1, "capitol", true);
        ex6();
        ex7();
    }

    static void ex1() {
        System.out.println("Imi place Java");
    }

    static void ex2() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Cursul acesta este foarte fain!");
        }
    }

    static void ex3() {
        System.out.println("Ana are 24 de ani.David este cu 6 ani mai mic.");
        System.out.println("Varsta lui David este: " + (24 - 6) + " ani");
    }

    static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti sirul: ");
        String sir = scanner.nextLine();
        System.out.println("Sirul introdus este: " + sir);
    }

    static void myVariables_ex5(int a, String b, boolean c) {
        System.out.println(a + "\n" + b + "\n" + c);
    }

    static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: a=");
        int a = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: b=");
        int b = scanner.nextInt();
        System.out.println("Numerele introduse sunt: " + a + " si " + b);

    }

    static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numarul introdus este: ");
        float a = scanner.nextFloat();
        System.out.println("Rezultatul impartirii la 5 este: " + (a / 5));
        System.out.println("Rezultatul scaderii este: " + (a - 12.3));
        System.out.println("Rezultatul inmultirii este: " + (a * -3.2));
        System.out.println("Rezultatul impartirii la 4 este: " + (a / 4));
        System.out.println("Restul impartirii la 6 este: " + (a % 6));


    }


}






