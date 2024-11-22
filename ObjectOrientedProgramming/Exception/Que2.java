//package ObjectOrientedProgramming.Exception;
//WAP to return true if the number is pallindrom, else false
import java.util.Scanner;
public class Que2 {
    static boolean palindrome(int num){
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        if(num==rev){
            return true;
        }
            return false;
    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        System.out.println(palindrome(x));
    }
}
