package OOPs;

public class OOPsAbstractClass {
    public static void main(String args[]){
        // Grandfather gf = new Grandfather(); CANNOT CREAT OBJECT OF ABSTRACT CLASS
        Parent p = new Parent();
        p.familyMemberName("Ajay Sethi");
        System.out.println("Father Name: " + p.fatherName);
        Me m = new Me();
        m.familyMemberName("Varun Sethi");
        System.out.println("My name is: " + m.myName);
    }
}
abstract class Grandfather{
    Grandfather(){
        System.out.println("Contructor - Grandfather..");
    }
    String familyName;
    void familyName(String name){
        this.familyName = name;
    }
    abstract void familyMemberName(String name);
}

class Parent extends Grandfather{
    Parent(){
        System.out.println("Constructor - Parent..");   
    }
    String fatherName;
    void familyMemberName(String fName){
        this.fatherName = fName;
    }
}

class Me extends Parent{
    Me(){
        System.out.println("Constructor - Me..");
    }
    String myName;
    void familyMemberName(String mName){
        this.myName = mName;
    }
}
