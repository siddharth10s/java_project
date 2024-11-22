package memoryManagement.array.oneD_array;

import java.util.Scanner;

public class rotate {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = scn.nextInt();

        int [] arr1 = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the element inside the array");
            arr1[i]=scn.nextInt();
        }

        System.out.println("Enter the number of ele");

    }
}
