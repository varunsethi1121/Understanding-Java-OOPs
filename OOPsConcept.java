package OOPs;

public class OOPsConcept {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setUserName("Varun Sethi \n");
        System.out.print(ba.userName);
        ba.userName = "Madhulika Sethi \n";
        System.out.print(ba.userName);
        ba.setPassword("@Varun515 \n");
        // System.out.print(ba.userPassword); userPassword WILL NOT BE VISIBLE IN ANY
        // OTHER CLASS IT CAN ONLY BE CHANGES BUT CANT ACCESS THAT
        // System.out.print(ba.userPassword); CANT ACCESS userPassword AS IT IS A
        // PRIVATE FIELD
        System.out.print(ba.getPassword());

        // Student st = new Student();
        // Employee em = new Employee("Varun Sethi" , 23);

        Calculator c = new Calculator();
        System.out.println(c.sum(2, 5));
        System.out.println(c.sum(2, 3, 4));
        System.out.println(c.sum((float) 2.5, (float) 5.2));

        petDog pd = new petDog();
        pd.eats();

        Frog f = new Frog();
        f.walk();
    }
}

class BankAccount {
    String userName;
    private String userPassword;

    // SETTERS FUNCTIONS
    void setUserName(String name) {
        userName = name;
    }

    void setPassword(String pwd) {
        userPassword = pwd;
    }

    // GETTER FUNCTIONS USED TO ACCESS PRIVATE FIELDS OUTSIDE THE CLASS THEY ARE
    // DEFINED
    String getPassword() {
        return userPassword;
    }

    String getUserName() {
        return userName;
    }
}

class Student {

    String studentName;
    int studentRollNo;

    // CONSTRUCTOR MANUALLY DECLARED
    Student() {
        System.out.print("Empty Constructor being called \n");
    }
}

class Employee {

    String employeeName;
    int employeeId;

    Employee(String employeeName, int id) {
        this.employeeName = employeeName;
        System.out.print("Initialized Constructor being called \n");
    }
}

// INHERITANCE and TYPE OF INHERITANCE
class Mammal {

    String animalName;

    void mammalEat() {
        System.out.print("Lion eats Flesh.");
    }

    void mammalBreath() {
        System.out.print("Lion breath through lungs.");
    }
}

class Man extends Mammal {

    String manName;

    void manEat() {
        System.out.print("Man eats Paneer");
    }
}

class Fish extends Mammal {

    String fishName;

    void fishEat() {
        System.out.print("Fish eat Fish.");
    }
}

class Boy extends Man {

    String boyName;

    void boyEat() {
        System.out.print("Boy eats Biryani.");
    }

}

class Girl extends Man {

    String girlName;

    void girlEat() {
        System.out.print("Girl eats Shrikhand.");
    }
}

// POLYMORPHISM and TYPE OF POLYMORPHISM
// METHOD OVERRIDING => RUNTIME POLYMORPHISM DYNAMIC IN NATURE
class Animal {
    void eats() {
        System.out.print("Eats anything. \n");
    }
}

class petDog extends Animal {
    void eats() {
        System.out.print("Home Cooked Food. \n");
    }
}

// METHOD OVERLOADING => COMPILE TIME POLYMORPHISM
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

    //ABSTRACTION and ITS TYPES ABSTARCT CLASS 
abstract class Egg {
    Egg() {
        System.out.println("Constructor from Egg Class");
    }

    abstract void walk();
}

class Tadpole extends Egg{
    Tadpole() {
        System.out.println("Constructor from Tadpole Class");
    }

    void walk(){
        System.out.print("It crawls with many small legs");
    }
}

class Frog extends Tadpole{
    Frog(){
        System.out.println("Constructor from Frog Class");
    }

    void walk(){
        System.out.print("It walk with 4 legs");
    }
}