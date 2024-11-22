package memoryManagement.controlStatements;

public class q17 
{
    public static void main(String[] args) {
        //17. Write a program to find all roots of a quadratic equation.
        // (-b + Math.sqrt(b*b - 4*a*c))/2*a
                          
    int a=1;
    int b=4;
    int c=-5;
    
    double root1=(-b + Math.sqrt(b*b - 4*a*c))/2*a;
    double root2=(-b - Math.sqrt(b*b - 4*a*c))/2*a;
    System.out.println(root1);
    System.out.println(root2);
 
}
}