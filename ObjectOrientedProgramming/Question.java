// Que. WAP to create a class Student having their name, registration number, branch, and marks of 
//      three sujects. You should display the average of 5 students with their respective names 
//      and registration number.
package ObjectOrientedProgramming;

class Student{
    String Name = "Siddharth";
    int regNo = 101;
    String Branch = "CSBS";
    int M1 = 70;
    int M2 = 66;
    int M3 = 80;
    
    double average(){
        double sum = M1+M2+M3;
        double avg = sum/3;
        return avg;
    }

    void disp(){
        System.out.println("Name: " + Name);
        System.out.println("Registration-No: " + regNo);
        System.out.println("Branch: " + Branch);
        System.out.println("Average: " + average());
    }

}

public class Question {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.disp();
    }
}
