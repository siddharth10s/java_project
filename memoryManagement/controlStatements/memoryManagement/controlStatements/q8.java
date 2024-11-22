package memoryManagement.controlStatements;

public class q8 
{
    public static void main(String[] args) 
    {
        //8. Write a program to input any alphabet and check whether it is vowel or consonant


        char  c='I';

        // if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
        // {
        //     System.out.println(c + " is a vowel.");
        // }
        // else
        // {
        //     System.out.println(c + " is a consonent.");
        // }

        String a= ((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')) ? (c + " is a vowel.") : (c + " is a consonent.");
        System.out.println(a);
    }
    
}
