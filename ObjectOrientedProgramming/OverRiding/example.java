//package ObjectOrientedProgramming.OverRiding;
// Over riding also known as dynamic dispatch and run-time polymorphism
class Animal2{
    String name = "animal";
    String color = "White";

    void eat(){
        System.out.println("animal is eating");
    }
    void walk(){
        System.out.println("walking");
    }
}
class Tiger extends Animal2{
    String name = "tiger";
    String color = "yellow";

    void eat(){
        System.out.println("Tiger is eating");
    }
}
public class example {
    public static void main(String[] args) {
        Animal2 a= new Animal2();
        Tiger t = new Tiger();
        System.out.println(t.name);
        System.out.println(t.color);
        t.eat();
        a.eat();
        a.walk();
    }
}

