package memoryManagement.controlStatements;

public class q6 {

    public static void main(String[] args) 
    {
        // 6. Write a program to check whether a year is leap year or not
        
        int year=3000;
        
        //1. control statements if else method -->
        // if(year%4==0)
        // {
        //     if(year%100!=0)
        //     {
        //         System.out.println("It is a leap year");
        //     }
        //     else if(year%400==0)
        //     {
        //         System.out.println("it is a leap year");
        //     }
        //     else
        //     {
        //         System.out.println("not a leap year");
        //     }
        // }
        // else
        // {
        //     System.out.println("not a leap year");
        // }

        //2. ternary oerator -->
        String x= (year%4==0) ? (year%100!=0) ? "It is a leap year" : (year%400==0) ? "it is a leap year" : "it not a leap year" : "not a leap year";
        System.out.println(x);
    }
}
