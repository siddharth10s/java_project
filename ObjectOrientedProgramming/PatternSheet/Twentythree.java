//package ObjectOrientedProgramming.PatternSheet;

import java.util.Scanner;

public class Twentythree {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = scn.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i+1 ; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
