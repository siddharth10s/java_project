package ObjectOrientedProgramming.Inheritence;
//two parents one child ---> multiple inheritance doesn't support in java.
//Question:- Can we achieve Multiple inheritance in java?
//Answer:- 
// class demo1{
//     void disp(){
//         System.out.println("display");
//     }
// }
// class demo2{
//     void show(){
//         System.out.println("showing");
//     }
// }
// class demoo extends demo1, demo2 {
    
// }
// public class MltipleInheritance {
//     public static void main(String[] args) {
//         demoo d = new demoo();
//         d.disp();
//         d.show();
//     }   
// }
// Here we can see a single class i stryin =g to inherit thne properties and behaviors of two differnt 
// classes, due to which JVM gets confused whos properties and behavoiurs is to be inherited. This 
// raises to a ambiguity problem.

// WE CAN ACHIEVE MULTIPLE INHERITANCE IN JAVA through interface.

interface Demo1{
    void disp();
}
interface Demo2{
    void show();
}
class demoo implements Demo1, Demo2{
    public void disp(){
        System.out.println("displaying");
    } 
    public void show(){
        System.out.println("showing");
    }
}
public class MltipleInheritance{
    public static void main(String[] args) {
        demoo d= new demoo();
        // Demo2 d1 = new demoo();
        d.disp();
        d.show();
    }
}