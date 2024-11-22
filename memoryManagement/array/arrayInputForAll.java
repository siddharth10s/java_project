package memoryManagement.array;

import java.util.Scanner;

public class arrayInputForAll {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = scn.nextInt();

        int [] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the element inside the array");
            arr[i]=scn.nextInt();
        }
        for (int a : arr) {
            System.out.println(a);
        }

    }
}
