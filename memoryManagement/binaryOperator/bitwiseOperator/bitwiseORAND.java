package memoryManagement.binaryOperator.bitwiseOperator;

public class bitwiseORAND {
    public static void main(String[] args) {
        int a=72;  // 01001000
        int b=122; // 01111010

        int x=a|b; //bitwise OR  01111010
        int y=a&b; //bitwise AND 01001000

        System.out.println(x);
        System.out.println(y);

    }
    
}
