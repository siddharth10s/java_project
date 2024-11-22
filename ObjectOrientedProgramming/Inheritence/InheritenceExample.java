package ObjectOrientedProgramming.Inheritence;

class Test1{
    String name = "Sid";
    int age = 20;

    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Test2 extends Test1{         //Inheritan'ce

}
public class InheritenceExample {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.disp();
    }
}
