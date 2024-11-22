//22.	WAP to check a number is perfect or not

import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int sum=0;

        for(int i=1; i<n; i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum==n){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
        scn.close();
    }
}