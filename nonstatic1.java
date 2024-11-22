public class nonstatic1 
{

    double cube(double a)   // creating a non static method.
    {
        double volume= a*a*a;  // performing the needed operation. 
        System.err.println(volume);  // printing the value.
        return 0;  // return a double value
    } 

    public static void main(String[] args) {
        double side= 10;  // local variable to take the side of cube.
        nonstatic1 ans= new nonstatic1();   // creating an object to call a non static  method.
        ans.cube(side);  // calling the non static method.
        

    }
}

