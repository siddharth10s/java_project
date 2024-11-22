
import java.util.Scanner;
public class creation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i]=scn.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            // if(arr[i]>max){
            //     ans=arr[i];
            // }

            max= Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
