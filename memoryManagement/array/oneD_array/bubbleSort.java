import java.util.Scanner;
//BUBBLE SORT ALGORITHM
public class bubbleSort {

    static void bubblesort(int arr[]){
        for(int i=0; i<arr.length ; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp; 
                }
            }
            System.out.print(arr[i] + " ");
        }
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
        System.out.print("Sorted array is: ");
        bubblesort(arr);
        scn.close();
    }
}
