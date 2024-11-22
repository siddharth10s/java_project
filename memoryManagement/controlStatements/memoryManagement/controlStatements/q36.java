package memoryManagement.controlStatements;

public class q36 {
    public static void main(String[] args) {
        // 36. Write a Java program that accepts three numbers and check All numbers are equal or not
        
        int num1=45;
        int num2=45;
        int num3=45;

        // if(num1==num2&& num2==num3){
        //     System.out.println("All the numbers are equal");
        // }
        // else{
        //     System.out.println("All the numbers are not equal");
        // }

        String x=  (num1==num2&& num2==num3)?"All the numbers are equal":"All the numbers are not equal";
        System.out.println(x);

    }
    
}
