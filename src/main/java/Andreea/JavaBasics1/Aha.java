package Andreea.JavaBasics1;

public class Aha {
    public static void main(String[] args) {
        outer_while:
        while (true) {
            int z = 0;
            inner_while:
            while (true) {
                if (z >= 10) {
                    break outer_while;
                } else {
                    System.out.println(z++);
                }
            }
        }

    }
}

