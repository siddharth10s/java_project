package memoryManagement.array.oneD_array;

import java.util.Scanner;

//Write a program to search an element in an array

//LINEAR SEARCH ALGORITHM
public class search {
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

        System.out.println("Enter the search element");
        int SearchElement= scn.nextInt();

        boolean flag=false;
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]==SearchElement){
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("element not found");
        }
    }
}
