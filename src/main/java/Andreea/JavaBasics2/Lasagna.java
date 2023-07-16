package Andreea.JavaBasics2;

public class Lasagna {

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(20, 3));
    }

    public static int expectedMinutesInOven() {

        return 40;
    }


    public static int remainingMinutesInOven(int minuteInCuptor) {

        return (expectedMinutesInOven() - minuteInCuptor);
    }


    public static int preparationTimeInMinutes(int layers) {

        return (layers * 2);
    }


    public static int totalTimeInMinutes(int minute, int layers) {
        return (preparationTimeInMinutes(layers) + minute);
    }

}

