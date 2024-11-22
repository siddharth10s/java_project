package memoryManagement.array.oneD_array;
//WAP to swap 2 variales without using arithmatic operator  -->>> using bitwise XOR operator.
public class swap2 {
    public static void main(String[] args) {
        int a=5;
        int b=7;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
