//A chocolate factory is packing chocolates into the packets. The 
//chocolate packets here represent an array  of N number of integer values. The task 
//is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).


import java.util.Scanner;

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Size of array: ");
        int N = scn.nextInt();
        int arr[] = new int[N];
        System.out.print("Array elements: ");
        for(int i=0; i<N; i++){
            arr[i]= scn.nextInt();
        }   
        
        int count = 0;
        for(int i=0 ; i<N ; i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=count; i<N ; i++){
            arr[i]=0;
        }
        for(int i = 0; i<N ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
