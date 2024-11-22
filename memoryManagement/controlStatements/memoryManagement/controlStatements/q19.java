package memoryManagement.controlStatements;

public class q19 
{
    public static void main(String[] args) 
    {
//         19. Write a program to input marks of five subjects Physics, Chemistry, Biology, 
// Mathematics and Computer. Calculate percentage and grade according to following:
//    • Percentage >= 90% : Grade A
//    • Percentage >= 80% : Grade B
//    • Percentage >= 70% : Grade C
//    • Percentage >= 60% : Grade D
//    • Percentage >= 40% : Grade E
//    • Percentage < 40% : Grade F

        int phy=96;
        int chem=59;
        int bio=95;
        int maths=51;
        int comp=74;

        float percentage= (phy+chem+bio+maths+comp)*100/500;
        System.out.println("percentage = " + percentage + "%");

        // if(percentage >= 90){
        //     System.err.println("Grade = A");
        // }
        // else if(percentage >= 80){
        //     System.out.println("Grade = B");
        // }
        // else if(percentage >= 70){
        //     System.out.println("Grade = C");
        // }
        // else if(percentage >= 60){
        //     System.out.println("Grade = D");
        // }
        // else if(percentage >= 40){
        //     System.out.println("Grade = E");
        // }
        // else {
        //     System.out.println("Grade = F");
        // }

        String X= (percentage >= 90)?"Grade = A":(percentage >= 80)?"Grade = B":
        (percentage >= 70)?"Grade = C":(percentage >= 60)?"Grade = D":(percentage >= 40)
        ?"Grade = E":"Grade = F";
        System.out.println(X);
    }
    
}
