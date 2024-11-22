import java.util.*;
public class bubbleSort {
    public static void print(int [] ar){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
// ---------->>>>>>>
        int temp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;}
            }
            print(arr);
        }
    }
}
