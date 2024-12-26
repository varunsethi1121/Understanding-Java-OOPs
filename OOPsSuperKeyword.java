package OOPs;

public class OOPsSuperKeyword {
    public static void main(String args[]) {
        // Dog d = new Dog(); 
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor..");
    }

    String color;
}

class Dog extends Animal {
    Dog() {
        super(); 
        System.out.println("Dog Constructor..");
        super.color = "Black"; 
        System.out.println("Color: " + super.color);
    }
}
