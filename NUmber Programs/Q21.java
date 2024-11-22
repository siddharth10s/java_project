//21.	WAP to find sum of all the factors/divisors of a given number

import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int sum=0;

        for(int i=1; i<=n ; i++){
            if(n%i==0){
                sum= sum + i;
            }
        }
        System.out.println("Sum of all the factors of " + n + " is: " + sum);
        scn.close();
    }
}
