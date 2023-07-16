package Andreea.JavaBasics2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExercitiiJava2 {


    public static void main(String[] args) {
       ex1();
       ex2();
       ex3();
       ex4();
       ex5();
       ex6();
       ex7();
       ex8();
       ex9();

    }

    public static void ex1() {
        System.out.println("----- EXERCITIUL 1 -----");
        Scanner number = new Scanner(System.in);
        System.out.print("Introduceti un numar de la tastatura: ");
        int numarCitit = number.nextInt();
        Random numar = new Random();
        int numarRandom = numar.nextInt();
        System.out.println("Numarul aleatoriu ales este: "+ numarRandom);
        if (numarCitit < numarRandom) {
            System.out.println("Numarul introdus este mai mic decat " + numarRandom);
        }else{
            System.out.println("Numarul introdus este mai mare decat " + numarRandom);}

    }

    public static void ex2(){
        System.out.println("----- EXERCITIUL 2 -----");
        Scanner numarAles = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int numar1 = numarAles.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = numarAles.nextInt();
        System.out.print("Introduceti o operatiune la alegere: 'a', 's', 'i', 'p', 'm' : ");
        Scanner caracter = new Scanner(System.in);
        char simbol = caracter.nextLine().charAt(0);

        switch (simbol) {
            case 'a':
                System.out.println(numar1 + numar2);
                break;
            case 's':
                System.out.println(numar1 > numar2 ? numar1 - numar2 : numar2 - numar1);
                break;
            case 'i':
                System.out.println(numar1 * numar2);
                break;
            case 'p':
                if (numar2 != 0) {
                    System.out.println(numar1 / numar2);
                } else {
                    System.out.println("Can't divide by 0!");
                }
                break;
            case 'm':
                System.out.println(numar1 % numar2);
                break;
            default:
                System.out.println("Eroare!");
        }
//
    }

    public static void ex3() {
        System.out.println("----- EXERCITIUL 3 -----");
        int[][] sirNumere = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        System.out.println(sirNumere[0][0]);
        System.out.println(sirNumere[2][4]);
    }

    public static void ex4() {
        System.out.println("----- EXERCITIUL 4 -----");
        char[] sirCaractere = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 1; i < sirCaractere.length; i += 2) {

            System.out.println(sirCaractere[i]);
        }
    }

    public static void ex5() {
        System.out.println("----- EXERCITIUL 5 -----");
        double[] sirDouble = {4.5, 3.2, 5.5, 3.8, 8.4};
        for (double v : sirDouble) {
            if (v == 4.5) {
                System.out.println(v);
            }
            if (v > 5) {
                System.out.println("Element peste 5");
            }
        }
    }

    public static void ex6() {
        System.out.println("----- EXERCITIUL 6 -----");
        String[] numeAngajati = {"Ana", "Ioana", "David", "Marian", "Ionut", "Alina", "George", "Victor", "Cezar"};
        for (int i = 0; i < numeAngajati.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(numeAngajati[i]);
            if (i == 7) {
                System.out.println("Index valid");
                break;
            }
        }
    }

    public static void ex7() {
        System.out.println("----- EXERCITIUL 7 -----");
        int[] numbers = {54, 56, 45, 25, 86};
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        System.out.println("Suma elementelor este: " + suma);
    }

    public static void ex8() {
        System.out.println("----- EXERCITIUL 8 -----");
        int[] numere = new int[0];
        ArrayList<String> nume = new ArrayList<>();
        int lungimeLista = nume.size();
        int lungimeArray = numere.length;
        System.out.println(lungimeArray == 0 ? "Sirul este gol" : "Sirul are " + lungimeArray + " elemente");
        System.out.println(lungimeLista == 0 ? "Lista este goala" : "Lista are " + lungimeLista + " elemente");

    }

    public static void ex9() {
        System.out.println("----- EXERCITIUL 9 -----\n");
        int[] numereIntregi = {3, 5, 8, 1, 89, 34, 12};
        System.out.println("Sirul de numere inainte de sortare este: ");
        for (int element : numereIntregi) {
            System.out.println(element);
        }

        for (int i = numereIntregi.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numereIntregi[j] > numereIntregi[j + 1]) {
                    int swat = numereIntregi[j];
                    numereIntregi[j] = numereIntregi[j + 1];
                    numereIntregi[j + 1] = swat;
                }
            }
        }
        System.out.println("Sirul de numere dupa sortare este: ");
        for (int element : numereIntregi) {
            System.out.println(element);
        }
    }
}


