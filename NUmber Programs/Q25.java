//25.	WAP to print all the prime numbers between two given range

import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number n1: ");
        int n1 = scn.nextInt();
        System.out.println("Enter the first number n2: ");
        int n2 = scn.nextInt();
        int count=0;

        for(int j=n1; j<=n2 ; j++){
            for(int i=2; i<j ; i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(j);
            }
        }
        scn.close();
    }
}