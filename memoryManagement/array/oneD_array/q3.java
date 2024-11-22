package memoryManagement.array.oneD_array;
// Write a program to find sum of even elements of an array. 

import java.util.Scanner;

public class q3 {
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

        int sum=0;
        for(int j=0; j< arr.length ; j++)
        {
            if(arr[j]%2==0){
                sum = sum + arr[j];
            }
        }

        System.out.println("The sum of even elements of array is: " + sum);
        scn.close();
    }
}
