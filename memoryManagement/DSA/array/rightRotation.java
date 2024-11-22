import java.util.Scanner;

public class rightRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }

        int temp=arr[size-1];
        for(int i=size-1; i<=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int a: arr){
            System.out.print(a + " ");
        }


    }
}
