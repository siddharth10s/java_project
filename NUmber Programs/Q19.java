//19.	WAP to find all the factors/divisors of a given number

import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();

        for(int i=1; i<=n ; i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        scn.close();
    }
}
