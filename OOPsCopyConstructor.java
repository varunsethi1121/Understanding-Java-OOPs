package OOPs;

public class OOPsCopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.studentName = "Varun Sethi";
        s1.studentDepartment = "Computer Science and Engineering";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;
        Student s2 = new Student(s1);
        s1.marks[1] = 101;
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Student Department: " + s1.studentDepartment); 
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
// class Student{
//     String studentName;
//     String studentDepartment;
//     int marks[];

//     Student(){
//         marks = new int[3];
//         System.out.print("Constructor has been called...\n");
//     }

//     Student(Student s1){
//         marks = new int[3];
//         this.studentName = s1.studentName;
//         this.studentDepartment = s1.studentDepartment;
//         this.marks = s1.marks;
//     }
// } WILL PERFORM SHALLOW COPY

class Student{
    String studentName;
    String studentDepartment;
    int marks[];

    Student(){
        marks = new int[3];
        System.out.print("Constructor has been called...\n");
    }

    Student(Student s1){
        marks = new int[3];
        this.studentName = s1.studentName;
        this.studentDepartment = s1.studentDepartment;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}//WILL PERFORM DEEP COPY 