package OOPs;

public class OOPsInterface {
    public static void main(String args[]) {
        // Queen q = new Queen();
        // q.movesPlayed();
        // Rook r = new Rook();
        // r.movesPlayed();
        Son s = new Son();
        s.hardWork();
        Daughter d = new Daughter();
        d.loveAndCare();

    }
}

// MULTIPLE INHERITANCE
interface Father {
    void hardWork();
}

interface Mother {
    void loveAndCare();
}

//MULTIPLE INHERITANCE
class Son implements Father, Mother {
    public void hardWork() {
        System.out.println("Son Inherit this quality from Father.*****");
    }

    public void loveAndCare() {
        System.out.println("Inherit this quality from Mother.");
    }
}

class Daughter implements Father, Mother {
    public void hardWork() {
        System.out.println("Inherit this quality from Father.");
    }

    public void loveAndCare() {
        System.out.println("Daughter Inherit this quality from Mother.*****");
    }
}
// INTERFACE IMPLEMENTATION / TOTAL ABSTRACTION
// interface Chess{
// void movesPlayed();
// }

// class Queen implements Chess{
// public void movesPlayed(){
// System.out.println("In which ever direction she wants to move.");
// }
// }
// class Rook implements Chess{
// public void movesPlayed(){
// System.out.println("Right, Left, Top, Bottom.");
// }
// }