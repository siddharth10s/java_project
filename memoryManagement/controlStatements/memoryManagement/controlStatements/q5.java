package memoryManagement.controlStatements;

public class q5 {
    public static void main(String[] args) {
        // 5. write a program to check if given numer is even or odd

        int x=0;

        if(x%2==0){
            System.out.println(x + " is a even number");
        }
        
        else
        {
            System.out.println(x + " is a odd number");
        }

        String a= (x%2==0)? x + " is a even number" : x + " is a odd number" ;
        System.out.println(a);
    }
}
