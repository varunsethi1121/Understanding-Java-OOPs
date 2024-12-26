package OOPs;

public class OOPsGettersAndSetters {
    public static void main(String args[]){
        Family f1 = new Family();
        f1.setFamilyMemberName("abc");
        System.out.println("Family Member Name: " + f1.familyMemberName);
        f1.setFamilyMemberSpouseName("xyz");
        System.out.println("Family member Spouse Name: " + f1.familyMemberSpouseName);
        f1.setCoupleBedTime(123);
        // System.out.print("Couple Bed Time: " + f1.coupleBedTime); CANNOT ACCESS DUE TO PRIVATE VARIABLE RESTRICTIONS
        System.out.println("Couple Bed Time: " + f1.getCoupleBedTime());

    }
}

class Family{
    public String familyMemberName;
    public String familyMemberSpouseName;
    private int coupleBedTime;

    void setFamilyMemberName(String name){
        this.familyMemberName = name;
    }

    void setFamilyMemberSpouseName(String spouseName){
        this.familyMemberSpouseName = spouseName;
    }
    //SETTER FUNCTION TO MODIFY THE PRIVATE VAULE
    void setCoupleBedTime(int time){
        this.coupleBedTime = time;
    }
    //GETTER FUNCTION TO ACCESS THE PRIVATE VALUE
    int getCoupleBedTime(){
        return this.coupleBedTime;
    }

}