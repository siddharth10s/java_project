//16.	WAP to count the number of digits of a given number

import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int count = 0;
        while(n>0){
            //int rem = n % 10;
            n = n/10;
            count++;
        }
        System.out.println(count);
        scn.close();
    }
}
