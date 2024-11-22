//find the missing element in an array

import java.util.Scanner;

public class missingElement {
    static void missing(int arr[]){
        int sum=0;

        for(int i=0 ; i<arr.length ; i++){
            sum = arr[i] + sum;
        }

        int Total = (arr.length+1)*(arr.length+2)/2; //sum of n natural numbers

        System.out.println("Missing element is: " + (Total-sum));
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
        missing(arr);
    }
}
