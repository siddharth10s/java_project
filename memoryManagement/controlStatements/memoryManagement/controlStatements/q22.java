package memoryManagement.controlStatements;

public class q22 {
    public static void main(String[] args) {
//         //22. while purchasing certain items, a discount of 10% is offered if the quantity purchased is 
// more than 100. If quantity and price per item are input through the keyboard, write a 
// program to calculate the total expenses
          
            double price=200;
            double discount;
            double expenses;

            if(price>100){
                discount=0.1*price;
                expenses=price-discount;
                System.out.println("Total expenses is " + expenses);
            }
            else{
                System.out.println("Total expenses is " + price);
            }
    }
}
