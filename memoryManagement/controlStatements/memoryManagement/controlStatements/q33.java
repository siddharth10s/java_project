package memoryManagement.controlStatements;

public class q33 {
    public static void main(String[] args) {
        //steel hardess

        int hardness=60;
        double carbon=0.9;
        int strength= 6600;

        if(hardness>50 && carbon<0.7 && strength>5600){
            System.out.println("Grade 10");
        }
        else if(hardness>50 && carbon<0.7 ){
            System.out.println("Grade 9");
        }
        else if(carbon<0.7 && strength>5600){
            System.out.println("Grade 8");
        }
        else if(hardness>50 && strength>5600){
            System.out.println("Grade 7");
        }
        else if(hardness>50 ||carbon<0.7 || strength>5600){
            System.out.println("Grade 6");
        }
        else{
            System.out.println("Grade 5");
        }
    }
}
