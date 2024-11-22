package memoryManagement.controlStatements;

public class q18 {
    public static void main(String[] args) {
        //18. Write a program to calculate profit or loss

        int CP=200;
        int SP=600;
        int profit=SP-CP;
        int loss=CP-SP;
        
        // if(SP>=CP){
        //     System.out.println("The profit is " + profit);
        // }
        // else{
        //     System.out.println("The loss is " + loss);
        // }
        
        String a= (SP>=CP)? "The profit is " + profit : "The loss is " + loss ;
        System.out.println(a);
    }
}
