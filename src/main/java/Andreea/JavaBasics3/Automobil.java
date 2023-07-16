package Andreea.JavaBasics3;

import java.util.Random;

public class Automobil {

   private String vin;
    private Random random;

    public String getVin() {
        return vin;
    }

    private int counter;



    Automobil(){
        int randomNUmber = new Random().nextInt();
        this.vin = "VR" + counter + randomNUmber;
    }



}
