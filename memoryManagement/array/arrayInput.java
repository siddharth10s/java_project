package memoryManagement.array;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scn.nextInt();

        // creation of empty array object
        int[] arr = new int[size];
        // String[] arr= new String[size];

        // input element inside an array
        for (int i = 0; i <= size-1; i++) {
            System.out.println("enter the element: ");
            arr[i] = scn.nextInt();
            // arr[i] = scn.next();
        }
        
        System.out.println("th whole array is: ");
        // display array elements
        for (int a : arr) {
            System.out.println(a);
        }
       
        // for (String a : arr) {
        //     System.out.print(a);
        // }


    }
}
