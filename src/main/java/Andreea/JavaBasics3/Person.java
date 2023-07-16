package Andreea.JavaBasics3;

public class Person {

    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println(counter);
        Person person2 = new Person();
        System.out.println(counter);

//  metoda apelata in cadrul unui context static
        inTheClass();
    }


    public String getName() {
        return name;
    }

    // atribute - definite in cadrul clasei, nu in cadrul psvm
    private String name;

    public String getLastName() {
        return lastName;
    }

    private String lastName;
    final String SPECIE = "HOMO SAPIENS";
    int age;
    static int counter;
    static String className;

// constructori
     public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(){
        super();
        System.out.println("Calling default constructor");
        counter++;
    }



    public Person(String nameOfPerson, String lastNameOfPerson){
        this.name = nameOfPerson;
        this.lastName = lastNameOfPerson;
        System.out.println("Calling second constructor");
    }

    public Person(int age){
        this("Ana", "Ipate");
        this.age = age;
        System.out.println("Calling third constructor ");
    }
// metode
    void canTalk(){
        System.out.println("Person can talk");
    }

    void canWalk(){
        System.out.println("Person can walk");

    }

    void fullName(){
        System.out.println(this.name+" "+this.lastName);
    }

    static void inTheClass(){
        System.out.println("Printting from class");
    }


    public void sayHello(){
        System.out.println("Hello from person");
    }

}
