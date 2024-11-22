package memoryManagement.array.TwoD_array;

import java.util.Scanner;

public class multiply {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row:- ");
        int row = scn.nextInt();
        System.out.print("Enter column:- ");
        int col = scn.nextInt();

        int arr1[][] = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter arr1[" + i + "]" + "[" + j + "]: ");
                arr1[i][j]=scn.nextInt();
            }
        }
        int arr2[][] = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter arr2[" + i + "]" + "[" + j + "]: ");
                arr2[i][j]=scn.nextInt();
            }
        }

        int arr3[][] = new int [row][col];
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                for(int k = i; k<=j; k++){
                    System.out.println(arr3[i][j] = arr1[j][k]*arr2[k][j] + arr1[j][k]*arr2[k][j]);
                }
            }
            
        }

    }
}
