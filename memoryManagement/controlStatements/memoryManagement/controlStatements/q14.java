package memoryManagement.controlStatements;

public class q14 
{
    public static void main(String[] args) {
        //14. Write a program to input angles of a triangle and check whether triangle is valid or not

        int a=50;
        int b=20;
        int c=70;

        // if(a+b+c==180){
        //     System.out.println("Triangle is valid");
        // }
        // else{
        //     System.out.println("Tringle in INVALID");
        // }

        String x= (a+b+c==180)? "Triangle is valid":"Tringle in INVALID";
        System.out.println(x);
    }
    
}
