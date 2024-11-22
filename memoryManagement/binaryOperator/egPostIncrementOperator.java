package memoryManagement.binaryOperator;

public class egPostIncrementOperator 
{
    public static void main(String[] args) {
        
    int x=5;
    int y=6;
    // System.out.println(x++ + y++ + x + y);
    // System.out.println((x) + (y) + (x++) + (y++) + (x) + (y));
    // System.out.println( (x) + (x) + (x++) +(y) + (y++));
    // System.out.println((x) + (y++) + (y) + (x) + (x++) + (x) + (y++) + (y));
    System.out.println((x) + (y++) + (y) + (x) + ((x++) + (x)) + (y++) + (y));
    }
    
}
