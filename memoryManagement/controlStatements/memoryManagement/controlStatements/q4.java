package memoryManagement.controlStatements;

public class q4 {
    public static void main(String[] args) {

        //4. Write a program to check whether a number is divisible by 5 and 11 or not
        
        int x=11;

        // if(x%5==0 && x%11==0){
        //     System.out.println(x + " is devisible by 5 as well as 11");
        // }
        // else if(x%5==0){
        //     System.out.println(x + " is divisible by 5");
        // }
        // else if(x%11==0){
        //     System.out.println(x + " is divisible by 11");
        // }
        // else{
        //     System.out.println(x + " is not devisible by 5 as well as 11");
        // }

        String a= (x%5==0 && x%11==0)? x + " is devisible by 5 as well as 11":(x%5==0) ? x + " is divisible by 5" : (x%11==0) ? x + " is divisible by 11" : x + " is not devisible by 5 as well as 11";
        System.out.println(a);
        
//         System.out.println( si());
//     }
//     static int si()
//     {
//    return 5;
    }
}
