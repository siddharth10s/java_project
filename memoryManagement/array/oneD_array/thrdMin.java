import java.util.Scanner;

public class thrdMin {
    static int thirdMinimum(int []arr){
        int Min= Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<Min){
                thirdMin = secondMin; 
                secondMin= Min;
                Min = arr[i];
            }
            else if(arr[i]<secondMin && arr[i]!=Min){
                thirdMin=secondMin;
                secondMin=arr[i];
            }
            else if(arr[i]<thirdMin && arr[i]!=secondMin && arr[i]!=Min){
                thirdMin=arr[i];
            }
        }
        return thirdMin;
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
        System.out.println("Third Minimum value is: " + thirdMinimum(arr));
        scn.close();
    }
}
