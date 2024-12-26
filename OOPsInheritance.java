package OOPs;

public class OOPsInheritance {
    public static void main(String args[]) {
        Me m = new Me();
        m.setGrandFatherName("Pawan Kumar Sethi");
        System.out.println("Grand Father Name: " + m.grandFatherName);
        m.setFatherName("Ajay Sethi");
        System.out.println("Fathers Name: " + m.fatherName);
        m.setMyName("Varun Sethi");
        System.out.println("My Name: " + m.myName);

    }
}

class Family {
    Family() {
        System.out.println("Family Constructor has been called...");
    }
}

class Grandparents extends Family {
    Grandparents() {
        System.out.println("Grandparents Constructor has been called...");
    }

    String grandFatherName;

    void setGrandFatherName(String fName) {
        this.grandFatherName = fName;
    }
}

class Chacha extends Grandparents{
    Chacha(){
        System.out.println("Chacha Constructor has been called...");
    }

    String chachaName;

    void setChachaName(String cName){
        this.chachaName = cName;
    }
}

class Parents extends Grandparents {
    Parents() {
        System.out.println("Parents Constructor has been called...");
    }

    String fatherName;

    void setFatherName(String pName) {
        this.fatherName = pName;
    }
}

class Me extends Parents {
    Me() {
        System.out.println("Me Constructor has been called...");
    }

    String myName;

    void setMyName(String mName) {
        this.myName = mName;
    }
}