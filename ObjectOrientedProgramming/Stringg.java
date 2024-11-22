//package ObjectOrientedProgramming;

import java.util.Scanner;
//WAp to find length of given string without using .length() method.

public class Stringg {

    static int len(String str){
        int length=0;
        for(char Ch:str.toCharArray()){
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String str1 = "Java programming";
        System.out.println(len(str1));   
    }
}
//WAP to take user input in an array    
