package ObjectOrientedProgramming;

class Dog{
    String name = "Tommy";
    String color = "White";
    int age = 5;

    void sleep(){
        System.out.println("Tommy is sleeping");
    }
    void eat(){
        System.out.println("Tommy is eating");
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.eat();
        System.out.println(d1.age);
        d1.sleep();
        System.out.println(d1.color);
    }
}

//WAP to create a class Student having their name, registration number, branch, and marks of 
//three sujects. You should display the average of marks of 5 students with their respective names 
//and registration number.