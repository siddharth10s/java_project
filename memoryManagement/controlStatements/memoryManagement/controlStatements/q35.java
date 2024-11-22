package memoryManagement.controlStatements;

public class q35 {
    public static void main(String[] args) {
        
        double timetaken=6.5; //in hours
        
        if(timetaken<=3){
            System.out.println("You are highly efficient");
        }
        else if(timetaken>3 && timetaken<=4){
            System.out.println("Please try to improve your speed");
        }
        else if(timetaken>4 && timetaken<=5){
            System.out.println("Please undergo the training to improve your speed");
        }
        else{
            System.out.println("Sorry, you have to leave the company");
        }

    }
}
