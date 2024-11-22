package ObjectOrientedProgramming.Constructor;

class Student{

    // default constructor or zero parameterized constructor
    Student(){

    }
}

public class Default {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

    }
}