//24.	WAP to check if a number is prime or not

import java.util.Scanner;
public class Q24Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number n1: ");
        int n = scn.nextInt();
        int count=0;

        for(int i=2; i<n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scn.close();
    }
}
