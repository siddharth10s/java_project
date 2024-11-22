////WAP to create a class Student having their name, registration number, branch, and marks of 
//three sujects. You should display the average of marks of atleast 5 students with their respective names 
//and registration number.
package ObjectOrientedProgramming.Constructor;

class Student3{
    String name;
    int regId;
    String branch;
    int maths;
    int english;
    int science;

    Student3(String name , int regId , String branch, int maths, int english, int science ){
        this.name=name;
        this.regId=regId;
        this.branch=branch;
        this.maths=maths;
        this.english=english;
        this.science=science;
    }

    void disp(){
        System.out.println("Name : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Registration number : " + regId);
        System.out.println("Marks in maths : " + maths);
        System.out.println("Marks in english  : " + english);
        System.out.println("Marks in science  : " + science);
        System.out.println("Average is : " + (maths+english+science)/3);
    }
}

public class parameterized {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Siddharth", 101, "CSBS", 94, 85, 80);
        Student3 s2 = new Student3("Raj", 102, "CSE", 90, 68, 60);
        Student3 s3 = new Student3("Aman", 103, "ECE", 84, 53, 90);
        Student3 s4 = new Student3("karan", 104, "ME", 45, 92, 86);
        Student3 s5 = new Student3("Harsh", 105, "IT", 75, 46, 88);

        s1.disp();
        s2.disp();
        s3.disp();
        s4.disp();
        s5.disp();

    }
}