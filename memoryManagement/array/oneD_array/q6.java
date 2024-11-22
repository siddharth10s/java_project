package memoryManagement.array.oneD_array;

import java.util.Scanner;

// Write a rogram to find the maximum element in an array
public class q6 {

    static void maxValue(int [] arr, int size){
        int max = Integer.MIN_VALUE;
        for(int j=0; j<size; j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("The maximum element in an array is: " + max);
    }

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

        maxValue(arr, size);

        // // int max= -2147483648;
        // int max= Integer.MIN_VALUE;
        // for(int j=0; j<arr.length; j++)
        // {
        //     if(arr[j]>max)
        //     {
        //         max=arr[j];
        //     }
        // }
        // System.out.println("The maximum element in an array is: " + max);
        scn.close();
    }
}
