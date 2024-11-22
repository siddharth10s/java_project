// 18.	WAP to check a number is palindrome or not

import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int rev=0;
        int temp = n;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            rev = 10 * rev + rem;
        }
        System.out.println(rev);
        scn.close();

        if(rev==temp){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
