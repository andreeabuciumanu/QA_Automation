package Andreea.JavaBasics1;

import java.util.Random;

public class exercitiiAndreea {

    public static int Numar(){
        Random numar = new Random();
        return numar.nextInt();
    }

    public static void main(String[] args) {
        int numar=413;
        switch (numar){
            case 200, 300:
                System.out.println("Numar par");
                break;
            case 301, 401:
                System.out.println("Numar impar");
                break;
            case 413:
                System.out.println("Numar corect");
                break;
            default:
                System.out.println("Invalid return");

        }
    }


}
