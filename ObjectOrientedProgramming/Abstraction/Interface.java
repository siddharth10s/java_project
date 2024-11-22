//package ObjectOrientedProgramming.Abstraction;

interface Calculatorrr{
    
    int x=4;  // by default abstract in interface
    int y=2;
    int add(int a, int b);
    int substract(int a, int b);
    int mlutiply(int a, int b);
    int divide(int a, int b);
}

class result implements Calculatorrr{
    void statement(){
        System.out.println("if x: " + x + " and y: " + y + "then-->> ");
    }
    public int add(int a, int b){
        int z=a+b;
        return z;
    }
    public int substract(int a, int b){
        int z = a-b;
        return z;
    }
    public int mlutiply(int a, int b){
        int z = a*b;
        return z;
    }
    public int divide(int a, int b){
        int z = a/b;
        return z;
    }
   
}

public class Interface {
    public static void main(String[] args) {
        result r = new result();
        System.out.println(r.add(4,2));
        System.out.println(r.substract(4,2));
        System.out.println(r.mlutiply(4,2));
        System.out.println(r.divide(4,2));
    }
}
