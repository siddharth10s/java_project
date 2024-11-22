package memoryManagement.array.oneD_array;

import java.util.Scanner;

public class binarySearch {

    static int BinarySearch(int []arr, int SE)
    {
        int l=0;
        int r= arr.length-1;
         
        while(l<=r){
        int mid = (l+r)/2;
        
            if(arr[mid]==SE){
                return mid;
            }
            if(SE>arr[mid]){
                l=mid+1;
            }
            if(arr[mid]>SE){
                r=mid-1;
            }
        }
        return -1;
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

        System.out.println("Enter search element");
        int SE= scn.nextInt();
        BinarySearch(arr1, SE);
    }
    
}
// WAP to find a number is prime or not
