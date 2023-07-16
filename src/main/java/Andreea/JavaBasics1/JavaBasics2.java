package Andreea.JavaBasics1;

public class JavaBasics2 {
    public static void main(String[] args) {
        int[] numere = new int[5]; // numere = [0, 0, 0, 0, 0]
        numere = new int[]{1, 3, 5, 6, 8};
        System.out.println(sumaArray(numere));
        System.out.println(numere);
    }

    static int sumaArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;

    }
}








