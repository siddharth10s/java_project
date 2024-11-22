package memoryManagement.controlStatements;

public class q38 {
    public static void main(String[] args) {
//         38. Write a java program that accepts three numbers from the user and check if numbers 
// are in "increasing" or "decreasing" order
        int a=55;
        int b=45;
        int c=7;

        // if(a<b && b<c){
        //     System.out.println("Increasing order");
        // }
        // else if(a>b && b>c){
        //     System.out.println("Decreasing order");
        // }
        // else{
        //     System.out.println("wrong input");
        // }

        String x=(a<b && b<c)?"Increasing order":(a>b && b>c)?"Decreasing order":"wrong input";
        System.out.println(x);

    }
    
}
