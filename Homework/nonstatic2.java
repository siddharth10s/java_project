public class nonstatic2 
{

    double triangle(double x, double y)   // creating a non static method.
    { 
        double area= 0.5*x*y;   // performing the needed operation. area of trinagle is 1/2* base * height
        System.out.println(area);   // printing the value.
        return 0;  // return a double value
    }

    public static void main(String[] args) 
    {
        double base=10;   // local variable to take the base of the triangle.
        double height=5;  // local variable to take the height of the triangle.

        nonstatic2 ans= new nonstatic2();   // creating an object to call a non static  method.
        ans.triangle(base, height);   // calling the non static method.

    }

}
