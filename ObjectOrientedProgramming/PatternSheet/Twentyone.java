//package ObjectOrientedProgramming.PatternSheet;

import java.util.Scanner;

public class Twentyone {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=1, num=n; j<=n-i+1; j++,num--){
                System.out.print(num);
            }
            
            System.out.println();
        }
    }
}