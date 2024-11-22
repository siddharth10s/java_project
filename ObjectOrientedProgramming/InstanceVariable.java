package ObjectOrientedProgramming;

class dog1{
    static String name  ;
    static int age= 5 ;

    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        dog1 d1 = new dog1();
        d1.disp();

        // System.out.println(new dog1().name); //called using constructor
    }
}
