package memoryManagement.controlStatements;

public class q34 {
    public static void main(String[] args) {
//         34. A library charges a fine for every book returned late. For first 5 days the fine is 50 
// paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the 
// book after 30 days your membership will be cancelled. Write a program to accept the 
// number of days the member is late to return the book and display the fine or the 
// appropriate message

        int latedays=6;
        if(latedays<=5){
            System.out.println("fine= 50 paise");
        }
        else if(latedays>5 && latedays<=10){
            System.out.println("fine=1 rupees");
        }
        else if(latedays>10 && latedays<=30){
            System.out.println("fine = 5 rupees");
        }
        else{
            System.out.println(" your membership has been cancelled");
        }

    }
    
}
