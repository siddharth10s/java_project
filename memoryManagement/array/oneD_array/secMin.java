package memoryManagement.array.oneD_array;

// WAPP to find the second minimum from a given array.

import java.util.Scanner;

public class secMin {
    
    static int secMinimum(int []arr){
        int Min= Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<Min){
                secondMin= Min;
                Min = arr[i];
            }
            else if(arr[i]<secondMin && arr[i]!=Min){
                secondMin=arr[i];
            }
        }
        return secondMin;
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
        System.out.println("Second Minimum value is: " + secMinimum(arr));
        scn.close();
    }
}
