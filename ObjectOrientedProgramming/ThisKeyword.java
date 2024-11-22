package ObjectOrientedProgramming;

public class ThisKeyword {
    void show(){
        System.out.println("Show is working");
    }
    void disp(){
        this.show(); // calling the method throgh this keyword
        System.out.println("disp is working");
    }
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.disp();
    }
}
