package memoryManagement.controlStatements;

public class q3 
{
    public static void main(String[] args) 
    {
        //3. Write a program to check whether a number is negative, positive or zer

        int x=-8;

        // if(x<0){
        //     System.out.println("it is negative");
        // }
        // else if(x==0){
        //     System.out.println("it is zero");
        // }
        // else{
        //     System.out.println("it is positive");
        // }

        String a= (x<0) ? "it is negative" : (x==0) ? "it is zero" : "it is positive";
        System.out.println(a);
    }
    
}
