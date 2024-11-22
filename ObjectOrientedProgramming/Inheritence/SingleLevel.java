package ObjectOrientedProgramming.Inheritence;

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{

}

public class SingleLevel {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
    }
}
