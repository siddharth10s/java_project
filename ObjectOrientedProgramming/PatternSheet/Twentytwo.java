//package ObjectOrientedProgramming.PatternSheet;

import java.util.Scanner;

public class Twentytwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=2 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=1, num=n-i+1; j<=n-i+1; j++,num--){
                System.out.print(num);
            }
            
            System.out.println();
        }
    }
}
