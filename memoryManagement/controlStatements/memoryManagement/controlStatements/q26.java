package memoryManagement.controlStatements;

public class q26 {
    public static void main(String[] args) {

//         26. A company insures its drivers in the following cases:
// • If the driver is married
// • If the driver is unmarried, male & above 30 years of age
// • If the driver is unmarried, female & above 25 years of age

        char married= 'n'; //y or n
        char gender= 'f'; //m or f
        int age=20;

        if(married=='y'){
            System.out.println("Accepted");
        }
        else if(married=='n' && gender=='m' && age>=30){
            System.out.println("accepted");
        }
        else if(married=='n' && gender=='f' && age>=25){
            System.out.println("aCCepted");
        }
        else{
            System.out.println("Rejected");
        }
    }
    
}
