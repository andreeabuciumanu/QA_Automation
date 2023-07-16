package Andreea.JavaBasics2;

import java.util.Scanner;

public class AplicatieBancara {

    public static void main(String[] args) {

        int pin = 3456;
        boolean cardBlocat = false;
        int numarIncercari = 3;
        while (numarIncercari > 0) {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Va rugam introduceti pinul: ");
            int codPin = scaner.nextInt();
            if (pin == codPin) {
                System.out.println("Bine ai venit!");
                break;
            } else {
                System.out.println("Codul pin este gresit, va rugam incercati din nou");
                numarIncercari--;
                System.out.println("Mai aveti " + numarIncercari + " incercari");
            }
            if (numarIncercari == 0) {
                cardBlocat = true;
                System.out.println("Cardul a fost blocat!");
            }

        }

    }
}
