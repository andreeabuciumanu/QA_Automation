package Andreea.OOPExercises;

public interface Counter {

    int count = 10;
}

class TestMyCounter{
    public static void main(String[] args) {
        Counter [] arr = new Counter[2];
        for(Counter ctr : arr){
            System.out.println(ctr.count);
        }
    }
}