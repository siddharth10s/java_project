//package ObjectOrientedProgramming.Constructor;
class Parent{
    String name;
    int age;

    Parent(String name, int age){
        this.name=name;
        this.age=age;
    }
    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Child extends Parent{
    String address;
    Child(String name, int age, String address){
        super(name,age);
        this.address=address;
    }
    void show(){
        super.disp();   //it can call the methods of parent class
        //super keyword should be kept inside a method in which we are calling it.
        // method ke bahar rakhege to error dega.
        System.out.println(address);
    }
}
//final class can't be inherited
//final variables can't be modified
// order of priority----- [static block >> instance block >> constructor block]
public class SuperKeyword {
    public static void main(String[] args) {
        Child c1 = new Child("Bharat", 12, "bhopal");
        c1.show();
    }
}
