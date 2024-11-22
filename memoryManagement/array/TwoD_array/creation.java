package memoryManagement.array.TwoD_array;

import java.util.Scanner; 
public class creation {
    public static void main(String[] args) {
        //CREATION
        
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row= ");
        int row = scn.nextInt();
        System.out.print("Enter column= ");
        int col = scn.nextInt();

        int arr[][] = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter arr[" + i + "]" + "[" + j + "]: ");
                arr[i][j]=scn.nextInt();
            }
        }

        //DISPLAY
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
