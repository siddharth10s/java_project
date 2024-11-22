//package ObjectOrientedProgramming.Abstraction;

abstract class Calculator{
    
    void question()
    {
        System.out.println("use below methods");
    }
    abstract void add();
    abstract void substract();
    abstract void mlutiply();
    abstract void divide();
}

class result extends Calculator{
    
    void add(){
        System.out.println("Adding");
    }
    void substract(){
        System.out.println("Substracting");
    }
    void mlutiply(){
        System.out.println("Multiplying");
    }
    void divide(){
        System.out.println("dividing");
    }
   
}

public class Calc {
    public static void main(String[] args) {
        result r = new result();
        r.question();
        r.add();
        r.substract();
        r.mlutiply();
        r.divide();
        
    }
}
