package Andreea.JavaBasics3;

import java.time.LocalDate;

public class Employee extends Person{

    Employee(){
        super();
        this.id ++;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    private int id = 5;

    LocalDate dataOfEmployment;
    double yearsOfExperience;

    public void doWork(){
        System.out.println("Working");
    }


    @Override
    public void sayHello() {
        System.out.println("Hello from employee");
    }

    public void sayHello(String message){
        System.out.println("hello this is " + message);
    }

    public static void main(String[] args) {
        Employee muncitor = new Employee();

//        Employee cristian = new Employee();
//        cristian.lastName = "Andrei";
//        cristian.age = 23;
//        cristian.canTalk();
//        cristian.canWalk();

//        Person persoana = new Person();
//
//
//        Person cristian = new Person("CRISTIAN", "SANDU");
//            Base b = new Base();
//
//        Person andrei = new Person("Andrei","Matei", 45);
//        andrei.fullName();
//
//        Person popescu = new Person(15);
//        System.out.println(popescu.getName());









    }
}
