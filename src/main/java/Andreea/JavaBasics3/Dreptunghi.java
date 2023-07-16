package Andreea.JavaBasics3;

public class Dreptunghi {
    public int latime;
    public int inaltime;

    public int getAria() {
        return this.latime*this.inaltime;
    }

    public Dreptunghi(int latime, int inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;

    }

    public static void main(String[] args) {


        Dreptunghi dreptunghi = new Dreptunghi(3, 4);
        System.out.println(dreptunghi.getAria()); // => 12
        dreptunghi.latime = 2;
        System.out.println(dreptunghi.getAria()); // => 12

    }
}