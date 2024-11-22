package memoryManagement.controlStatements;

public class q16 
{
    public static void main(String[] args) {
        //16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
        // Answer:- equilateral means all sides equal
                 // isosceles means twosides equal 
                 // scalene means all sides different.

        int A=10;
        int B=40;
        int C=20;
        
        // if((A==B)&&(B==C)){
        //     System.out.println("Equilateral Triangle");
        // }
        // else if((A!=B)&&(B!=C)&&(A!=C)){
        //     System.out.println("Scalene Triangle");
        // }
        // else{
        //     System.out.println("Isosceles Triangle");
        // }

        String x= ((A==B)&&(B==C))?"Equilateral Triangle":((A!=B)&&(B!=C)&&(A!=C))?"Scalene Triangle":"Isosceles Triangle";
        System.out.println(x);
    }
    
}
