package memoryManagement.array.oneD_array;

public class swap {
    public static void main(String[] args) {
        
        int a=5;
        int b=7;

        // //with third variable
        // int c;

        // c=a;
        // a=b;
        // b=c;

        //without third variable

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
        
        
    }
}
