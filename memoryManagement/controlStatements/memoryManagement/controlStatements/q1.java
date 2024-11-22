package memoryManagement.controlStatements;

public class q1 {
    public static void main(String[] args) 
    {
        //Write a program to find maximum between two numbers
        
        int x=42;
        int y=22;

        // if(x>y){
        //     System.out.println(x + " is greater than " + y);
        // }
        // else if(x==y){
        //     System.out.println(x + " is qual to " + y);
        // }
        // else{
        //     System.out.println(x +" is less than " + y);
        // }

        String a = (x>y)? x +" is less than " + y : (x==y)? x + " is qual to " + y : x +" is less than " + y; 
        System.out.println(a);
    }
}
