package memoryManagement.controlStatements;

public class q40 {
    public static void main(String[] args) {
        //40. Write a Java program to check whether the given integer is a multiple of 5

        int num=45;

        // if(num%5==0){
        //     System.out.println(num + " is a multiple of 5");
        // }
        // else{
        //     System.out.println(num + " is not a multiple of 5");
        // }

        String x= (num%5==0)?num + " is a multiple of 5":num + " is not a multiple of 5";
        System.out.println(x);
    }
    
}
