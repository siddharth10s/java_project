import java.util.Scanner;

public class thrdmax {
    static int thirdMaximum(int arr[]){
        int max= Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                thirdmax=secondmax;
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                thirdmax=secondmax;
                secondmax=arr[i];
            }
            else if(arr[i]>thirdmax && arr[i]!=secondmax && arr[i]!=max){
                thirdmax=arr[i];
            }
        }
        return thirdmax;
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
        System.out.println("Third Maximum value is: " + thirdMaximum(arr));
    }
}
