package memoryManagement.controlStatements;

public class q10 
{
    public static void main(String[] args) {
        //10. Write a program to check whether a character is uppercase or lowercase alphabet

        char c='k';

        // if((c>='a')&&(c<='z'))
        // {
        //     System.out.println(c + " is a lower case");
        // }
        // else if((c>='A')&&(c<='Z'))
        // {
        //     System.out.println(c + " is a upper case");
        // }
        // else
        // {
        //     System.out.println(c + " is not an alphabet");
        // }

        String a= ((c>='a')&&(c<='z')) ? (c + " is a lower case") : ((c>='A')&&(c<='Z')) ? (c + " is a upper case") : (c + " is not an alphabet") ;
        System.out.println(a);
    }
    
}
