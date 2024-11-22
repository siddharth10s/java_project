

import java.util.Scanner;

public class q2 {
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

        int product=1;

        for(int j=0; j< arr.length; j++)
        {
            product= product * arr[j];
        }
        System.out.println("The product of elements of array is: " + product);
    }
}
