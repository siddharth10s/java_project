package memoryManagement.controlStatements;

public class q11 
{
    public static void main(String[] args) {
        //11. Write a program to input week number and print week day

        int weeknumber= 5;

        // if(weeknumber%7==1){
        //     System.err.println("MONDAY");
        // }
        // else if(weeknumber%7==2){
        //     System.err.println("TUESDAY");
        // }
        // else if(weeknumber%7==3){
        //     System.err.println("WEDNESDAY");
        // }
        // else if(weeknumber%7==4){
        //     System.err.println("THURSDAY");
        // }
        // else if(weeknumber%7==5){
        //     System.err.println("FRIDAY");
        // }
        // else if(weeknumber%7==6){
        //     System.err.println("SATURDAY");
        // }
        // else if(weeknumber%7==0){
        //     System.err.println("SUNDAY");
        // }

        String a= (weeknumber%7==1)?"MONDAY":(weeknumber%7==2)?"TUESDAY":(weeknumber%7==3)?"WEDNESDAY":(weeknumber%7==4)?"THURSDAY":(weeknumber%7==5)?"FRIDAY":(weeknumber%7==6)?"SATURDAY":"SUNDAY";
        System.out.println(a);
    }
    
}
