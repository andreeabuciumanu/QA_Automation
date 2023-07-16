package Andreea.JavaBasics2;

import java.util.Arrays;

public class ExercitiiClasa2 {
    public static void main(String[] args) {
        int [] numere = {-13, 45, 5, 34, 67, 89, -3};
        numere[2]=6;
//        System.out.println(sumaNum(1,6,8,11,34));
        maximul(numere);
        System.out.println("Sirul dupa sortare este: " + formatArray(numere));
//        Arrays.sort(numere);
//        System.out.println(formatArray(numere));

        String [] sirString = {"23", "34", "56", "11"};
        System.out.println(formatStringArray(sirString));
        Arrays.sort(sirString);
        System.out.println(formatStringArray(sirString));

    }
//    varargs variable arguments -> int...args
    public static int sumaNum(int... args){
        int suma =0;
        for(int i=0;i<args.length;i++){
            suma += args[i];
        }
        return suma;
    }
    static void maximul(int[] array){
        for(int i =0;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
     static String formatArray(int [] array){
        String sir = "[";
        for(int element:array){
            sir += element + ", ";

        }
        return sir+ "]";
    }

    static String formatStringArray(String [] array){
        String sirString = "[";
        for(String element:array){
            sirString += element + ", ";

        }
        return sirString+ "]";
    }
}
