package Andreea.JavaBasics2;

public class MinMax {
    public static void main(String[] args) {
        int [] arr = {2, -1, 34, -45, 7, 56};
        System.out.println(maxNumber(arr));
        System.out.println(minNumber(arr));
    }


    static int minNumber(int[] sir){
        int min = 0;
        for (int i=0;i<sir.length;i++){
            if(sir[i]<min){
                min = sir[i];
            }
        }
        return min;

    }

    static int maxNumber(int[] sir){
        int max = 0;
        for (int i=0;i<sir.length;i++){
            if(sir[i]>max){
                max = sir[i];
            }
        }
        return max;
    }
}




