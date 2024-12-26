package OOPs;

public class OOPsPolymorphism {
    public static void main(String args[]) {
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(1, 2));
        // System.out.println(cal.sum((float) 1.1, (float) 2.2));
        // System.out.println(cal.sum(1, 2, 3));

        Animal ani = new Animal();
        ani.eats();
        Deer d = new Deer();
        d.eats();
    }
}

//METHOD/ FUNCTION OVERRIDING
class Animal{
    void eats(){
        System.out.println("Animal can eat anything.");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("Deer can only eat grass and green leaves.");
    }
}

//METHOD/FUNCTION OVERLOADING
// class Calculator {

//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }


