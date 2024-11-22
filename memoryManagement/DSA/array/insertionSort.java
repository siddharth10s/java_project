import java.util.*;
public class insertionSort {
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

        
        for(int i=1; i<n ; i++){
            int j=i-1, x=arr[i];
            while(j>=0 && arr[j]>x){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;

            print(arr);
        }
        
    }
}
