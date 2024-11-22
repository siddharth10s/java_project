//package ObjectOrientedProgramming.Questions;

// WAP to create class "Circle" with a radius attribute. You can access and modify this attribute.
// Calculate the area and circumference of the circle.

class Circle{
    double radius;
    static double pi = (22/7);

    Circle(double radius){
        this.radius=radius;
    }
    void mod(double radius){
        this.radius=radius;
    }
    void ans(){
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        System.out.println("Area: " + area);
        System.out.println("circumference: " + circumference);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        c1.ans();
        c1.mod(3);
        c1.ans();
    }   
}
