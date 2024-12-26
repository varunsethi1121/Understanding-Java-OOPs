package OOPs;

public class OOPsBasics {
    public static void main(String args[]) {
        collegeStudent student1 = new collegeStudent();
        student1.changeStudentName("Varun Sethi");
        System.out.println("Student Name: " + student1.studentName);
        student1.changeDepartmentName("Computer Science and Engineering");
        System.out.println("Department Name: " + student1.departmentName);
        student1.changeStudentAge(23);
        System.out.println("Student Age: " + student1.studentAge);
        student1.changeStudentGateScore(450);
        System.out.println("Student GATE Score: " + student1.studentGateScore);

        // BankAccountDetails user1 = new BankAccountDetails();
        // user1.bankOperatorName = "State Bank of India";
        // System.out.println("Bank: " + user1.bankOperatorName);
        // user1.setAccountUserName("Varun Sethi");
        // System.out.println("Account Holder Name: " + "Varun Sethi");
        // user1.setAccountUserPassword("@VarunSethi127154");
        // user1.accountUserPassword = "@VarunSethi127154"; CANNOT ACCESS PASSWORD AS IT IS A PRIVATE FILED 
        // System.out.println(user1.accountUserPassword); CANNOT ACCESS PASSWORD AS IT IS A PRIVATE FILED 


    }
}
// class BankAccountDetails{
//     public String bankOperatorName;
//     public String accountUserName;
//     private String accountUserPassword;

//     void setBankOperatorName(String bankname){
//         bankOperatorName = bankname;
//     }

//     void setAccountUserName(String username){
//         accountUserName = username;
//     }

//     void setAccountUserPassword(String password){
//         accountUserPassword = password;
//     }
// }

class collegeStudent {
    String studentName;
    String departmentName;
    int studentAge;
    int studentGateScore;

    void changeStudentName(String newName) {
        studentName = newName;
    }

    void changeDepartmentName(String newDepartment) {
        departmentName = newDepartment;
    }

    void changeStudentAge(int newAge) {
        studentAge = newAge;
    }

    void changeStudentGateScore(int newGateScore) {
        studentGateScore = newGateScore;
    }
}

