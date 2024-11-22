package ObjectOrientedProgramming.Inheritence;

class Animal3{
    void legs(){
        System.out.println("four legs");
    }
}
class Tiger extends Animal3{
    void kill(){
        System.out.println("kills");
    }
}
class Doggy extends Animal3{
    void dig(){
        System.out.println("digs");
    }
}
class Horse extends Animal3{
    void run(){
        System.out.println("Runs");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Tiger obj1 = new Tiger();
        obj1.legs();
        obj1.kill();
        Doggy obj2 = new Doggy();
        obj2.legs();
        obj2.dig(); 
        Horse obj3 = new Horse(); 
        obj3.legs();
        obj3.run();
        
    }
}
