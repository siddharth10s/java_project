package memoryManagement.controlStatements;

public class q9 
{
    public static void main(String[] args) 
    {
        //9. Write a program to input any character and check whether it is alphabet, digit or special character

        char c=4;

        // if((c>='a')&&(c<='z')){
        //     System.out.println(c + " is a alphabet");
        // }
        // else if((c>=48)&&(c<=57)){
        //     System.out.println(c + " is a digit");
        // }
        // else{
        //     System.out.println(c + " is a special character");
        // }

        String a= ((c>='a')&&(c<='z')) ? (c + " is a alphabet") : ((c>=0)&&(c<=9)) ? (c + " is a digit") : (c + " is a special character");
        System.out.println(a);
    }
    
}
