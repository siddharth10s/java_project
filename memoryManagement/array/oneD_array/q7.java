package memoryManagement.array.oneD_array;
// Write a program to reverse an array

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = scn.nextInt();

        int [] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the element inside the array");
            arr[i]=scn.nextInt();
        }

        for(int j=size-1; j>=0; j--){
            System.out.println(arr[j]);
        }
    }    
}
