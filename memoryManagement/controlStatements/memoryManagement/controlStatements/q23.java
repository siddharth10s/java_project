package memoryManagement.controlStatements;

public class q23 {
    public static void main(String[] args) {

//         23. The current year and the year in which the employee joined the organization are 
// entered through the keyboard. If the number of years for which the employee has served 
// the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If 
// the years of service are not greater than 3, then the program should do nothing.
        
        int current=2023;
        int join=2022;

        if(current-join>=3){
            System.out.println("Congratulations, You recieved a bonus of Rs. 2500/-");
        }

        String X= (current-join<=3)?"Congratulations, You recieved a bonus of Rs. 2500/-":"bye";
        System.out.println(X);;
    }
}
