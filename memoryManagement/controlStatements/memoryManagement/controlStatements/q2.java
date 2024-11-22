package memoryManagement.controlStatements;

public class q2 {
    public static void main(String[] args) 
    {
        //2. Write a program to find maximum between three numbers
        int x=51;
        int y=11;
        int z=6;

        // if(x>y){
        //     if(x>z){
        //         System.out.println(x + " is the grestest");
        //     }
        //     else{
        //         System.out.println(z + " is the greatest");
        //     }
        // }
        // else{
        //     if(y>z){
        //         System.out.println(y + " is the greatest");
        //     }
        //     else{
        //         System.out.println(z + " is the greatest");
        //     }
        // }
        
        String a= (x>y)? (x>z)? x + " is the grestest" : z + " is the greatest" : (y>z) ? y + " is the greatest" : z + " is the greatest";
        System.out.println(a);
    }
}
