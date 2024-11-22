package memoryManagement.array.oneD_array;

import java.util.Scanner;

public class subArray_bySum {
    static void  SubArrayBySum(int arr[], int sum){
        
        int csum=arr[0];
        int start=0;

        for(int i=0; i<arr.length;i++){
            while(csum<sum && start < i){
            csum= sum-arr[start];
            start++;

            if(csum==sum){
            System.out.println(start + " " + (i-1));
            }
            if(i<arr.length){
                csum=csum+arr[i];
            }
        }
        }
        

    }
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
        System.out.print("Enter sum= ");
        int sum = scn.nextInt();

        SubArrayBySum(arr1, sum);

    }
}
