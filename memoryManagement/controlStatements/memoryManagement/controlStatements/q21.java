package memoryManagement.controlStatements;

public class q21 {
    public static void main(String[] args) {

// 21. Write a program to input electricity unit charges and calculate total electricity bill 
// according to the given condition:
//    • For first 50 units Rs. 0.50/unit
//    • For next 150 units Rs. 0.75/unit
//    • For next 250 units Rs. 1.20/unit
//    • For unit above 250 Rs. 1.50/unit
//    • An additional surcharge of 20% is added to the bill
        
        double unit=5;
        double bill;

        if(unit<=50){
            bill=0.50*unit;
        }
        else if(unit<=200){
            bill= 0.75*unit;
        }
    }
}
