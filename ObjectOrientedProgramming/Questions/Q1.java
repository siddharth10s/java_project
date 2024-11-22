package ObjectOrientedProgramming.Questions;
// WAP to create a class called "Person" with a name and age attribute. Create two instances of
// "Person" class , set their attributes using the constructor, and print thier name and age.

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Person p1 = new Person("Kalu", 20);
        Person p2 = new Person("Billu", 19);
        p1.disp();
        p2.disp();
    }
}
