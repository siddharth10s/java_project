package memoryManagement.controlStatements;

public class q25 {
    public static void main(String[] args) {
//         25. The marks obtained by a student in 5 different subjects are input through the 
// keyboard. The student gets a division as per the following rules: Write a program to 
// calculate the division obtained by the student
// • Percentage above or equal to 60 - First division
// • Percentage between 50 and 59 - Second division
// • Percentage between 40 and 49 - Third division
// • Percentage less than 40 – Fail
        
        int phy=26;
        int chem=59;
        int bio=45;
        int maths=31;
        int comp=14;

        float percentage= (phy+chem+bio+maths+comp)*100/500;
        System.out.println("percentage = " + percentage + "%");

        // if(percentage >= 60){
        //     System.err.println("First division");
        // }
        // else if(percentage>=50 && percentage<=59){
        //     System.out.println("Second division");
        // }
        // else if(percentage>=40 && percentage<=49){
        //     System.out.println("Third division");
        // }
        // else {
        //     System.out.println("Fail");
        // }

        String X= (percentage >= 60)?"First division":(percentage>=50 && percentage<=59)?
        "Second division":(percentage>=40 && percentage<=49)?"Third division":"Fail";
        System.out.println(X);

    }
}
