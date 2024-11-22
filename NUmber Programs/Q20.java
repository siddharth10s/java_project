//20. WAP to count the number of factors/divisors of a given number

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.err.println();
        System.out.println("Total numer of factors: " + count);
        scn.close();
    }
}