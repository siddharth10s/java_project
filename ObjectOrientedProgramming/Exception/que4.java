//package ObjectOrientedProgramming.Exception;

import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();

        for(int r=1 ; r<=n ; r++){
            for(int c = 1 ; c<=r-1; c++)
            {
                System.out.print(" ");
            }
            for(int c=1 ; c <= 2*(n-r)+1 ;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
