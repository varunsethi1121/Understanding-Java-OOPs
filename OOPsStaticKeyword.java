package OOPs;

public class OOPsStaticKeyword {
    public static void main(String args[]){
        // Access static variable using class name. IF YOU WILL ACCESS WITH OBJECT NAME IT WILL REFLECT WARRNING
        Student.schoolName = "Nirmal Jyoti Hr Sec School";
        System.out.println("School Name: " + Student.schoolName);

        Student s1 = new Student();
        s1.setStudentName("Varun Sethi");
        System.out.println("Student Name: " + s1.getStudentName());

        Student s2  = new Student();
        s2.setStudentName("Rohan Sethi");
        System.out.println("School Name: " + Student.schoolName);
        System.out.println("Student Name: " + s2.getStudentName());
    }
}
class Student{
    String studentName;
    static String schoolName;

    void setStudentName(String name){
        this.studentName = name;
    }

    String getStudentName(){
        return this.studentName;
    }
}
