package memoryManagement.controlStatements;

public class q15 
{
    public static void main(String[] args) {
        //15. Write a program to input all sides of a triangle and check whether triangle is valid or not.
        //answer:- Sum of two sides is greater than the third side.

        int AB=10;
        int BC=14;
        int CA=12;

        // if((AB+BC>CA)&&(BC+CA>AB)&&(AB+CA>BC)){
        //     System.out.println("Given triangle is valid");
        // }
        // else{
        //     System.out.println("Given triangle is NOT valid");
        // }

        String X= ((AB+BC>CA)&&(BC+CA>AB)&&(AB+CA>BC))?"Given triangle is valid":"Given triangle is NOT valid";
        System.out.println(X);
    }
    
}
