package memoryManagement.controlStatements;

public class q37 {
    public static void main(String[] args) {
        //37. Write a Java program that reads an positive integer and count the number of digits
        
        int number=456;
        int count=0;

        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println(count);

    }
}
