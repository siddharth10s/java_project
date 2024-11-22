package memoryManagement.controlStatements;

public class q30 {
    public static void main(String[] args) {
//         30. Write a program to check whether a triangle is valid or not, when the three angles of 
// the triangle are entered through the keyboard. A triangle is valid if the sum of all the three 
// angles is equal to 180 degrees

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
