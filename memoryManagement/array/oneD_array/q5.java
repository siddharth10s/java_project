package memoryManagement.array.oneD_array;

import java.util.Scanner;

//Write a program to find the minimum element in an array

public class q5 {
    static int minValue (int [] arr,int size)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j]<min)
                {
                    min= arr[j];
                }
            } 
            return min;
        }
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

        System.out.println("The minimum element in an array is: " + minValue(arr, size));
        // int min = Integer.MAX_VALUE;

        // for(int j=0; j<arr.length; j++)
        // {
        //     if(arr[j]<min)
        //     {
        //         min= arr[j];
        //     }
        // }
        // System.out.println("The minimum element in an array is: " + min);

        scn.close();
    }

}    
