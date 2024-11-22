

import java.util.Scanner;

//write a program to merge two array
public class mergeArray {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array1");
        int size1 = scn.nextInt();

        int [] arr1 = new int[size1];
        for(int i=0; i<size1; i++)
        {
            System.out.println("Enter the element inside the array1");
            arr1[i]=scn.nextInt();
        }

        System.out.println("Enter the size of array2");
        int size2 = scn.nextInt();
        int [] arr2 = new int[size2];
        for(int i=0; i<size2; i++)
        {
            System.out.println("Enter the element inside the array2");
            arr2[i]=scn.nextInt();
        }

        //CODE LOGIC ---->>

        int [] arrN = new int[size1+size2];

        int j=0;
        for(int i=0; i<arr1.length;i++){
            arrN[j]=arr1[i];
            j++;
        }

        for(int i=0; i<arr2.length; i++){
            arrN[j] = arr2[i];
            j++;
        }

        for (int a : arrN) {
            System.out.print(a + " ");
        }
    }
}