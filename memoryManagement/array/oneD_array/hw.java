package memoryManagement.array.oneD_array;
import java.util.Scanner;
//Write a program to display the index at which the search element is present.
public class hw {
    public static void main(String[] args) 
    {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = scn.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the element if the array");
            arr[i]=scn.nextInt();
        } 

        System.out.println("Enter the Search element");
        int SE = scn.nextInt();
        
        boolean flag=false;
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]==SE)
            {
                flag=true;
                System.out.println("index at which the search element is present is: " + j);
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Search element not found.");
        }
        scn.close();  
    }
}
