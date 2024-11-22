package ObjectOrientedProgramming.OverRiding;
//WAP to create a class plane and child class such as figher plane, passanger plane and cargo plane.
//They have 4 methods - fly, take off, land and carry. 
//over ride the method which ou feel can be over rided.

class Plane{
    String name = "Plane";
    void fly(){
        System.out.println("flying");
    }
    void takeOff(){
        System.out.println("Taking off");
    }
    void land(){
        System.out.println("Landing");
    }
    void carry()
    {

    }
}
class Fighter extends Plane{
    String name = "Fighter Plane";
    void carry(){
        System.out.println("Fighter plane is Carrying Weapons");
    }
}
class Passanger extends Plane{
    String name = "Passanger Plane";
    void carry(){
        System.out.println("Passanger plane is Carrying passangers");
    }
} 
class Cargo extends Plane{
    String name = "Cargo Plane";
    void carry(){
        System.out.println("Cargo Plane is carrying");
    }
}

public class Question {
    public static void main(String[] args) {
        Plane p = new Plane();
        Fighter f = new Fighter();
        Passanger pas = new Passanger();
        Cargo c = new Cargo();

        System.out.println(p.name);
        f.carry();
        pas.carry();
        c.carry();

    }
}
