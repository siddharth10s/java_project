// 1.	WAP to display all natural numbers up-to n

import java.util.Scanner;

public class Q1 {
    void naturalNum(int num){
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scn.nextInt();

        Q1 obj = new Q1();
        obj.naturalNum(n);

    }
    
}
