package Andreea.JavaBasics3;

public class Instructor extends Employee

{


    String typeOfInstructor;
    String seniorLevel;
    int earsOfEmployment;


    public static void main(String[] args) {

        Instructor instructor1 = new Instructor();
        System.out.println(instructor1.getId());
        Instructor instructor2 = new Instructor();
        System.out.println(instructor2.getId());

        instructor1.doWork();
        instructor1.setId(1234);
        System.out.println(instructor1.getId());



    }
}
