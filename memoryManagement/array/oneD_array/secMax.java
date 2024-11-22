package memoryManagement.array.oneD_array;

// WAPP to find the second maximum from a given array.

import java.util.Scanner;

public class secMax {

    static int secMaximum(int arr[]){
        int max= Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax;
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
        System.out.println("Second Maximum value is: " + secMaximum(arr));
        scn.close();
    }
}
