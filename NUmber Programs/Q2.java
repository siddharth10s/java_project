//2.	WAP to display all whole numbers up-to n

import java.util.Scanner;
public class Q2 {
    void wholeNum(int num){
        for(int i=0; i<=num; i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scn.nextInt();

        Q2 obj = new Q2();
        obj.wholeNum(n);

    }
}