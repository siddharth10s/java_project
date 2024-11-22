//23.	WAP to print all perfect numbers between two given range

import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number n1: ");
        int n1 = scn.nextInt();
        System.out.println("Enter the second number n2: ");
        int n2 = scn.nextInt();

        for(int i=n1; i<=n2;i++){
            int sum=0;
            for(int j=1; j<i; j++){   
                if(i%j==0){    
                    sum = sum + j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
