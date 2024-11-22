//17.	WAP to reverse a given number

import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int rev=0;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            rev = 10 * rev + rem;
        }
        System.out.println(rev);
        scn.close();
    }
}
