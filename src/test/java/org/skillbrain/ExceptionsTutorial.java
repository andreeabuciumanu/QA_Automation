package org.skillbrain;

public class ExceptionsTutorial {

    public static void main(String[] args) {


        try {

            Thread.sleep(1000);
            throw new InterruptedException();


        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
