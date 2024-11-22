package ObjectOrientedProgramming;

//LOCAL VARIABLES

class Calculator{
    int additon(int a, int b){
        int c =a+b; // c is a local variable
        return c;
    }
}

public class Calculation {
    public static void main(String[] args) {
        int a=10;
        int b=20; // a and b are local variables

        Calculator C1= new Calculator();
        System.out.println(C1.additon(a, b));
       
    }
}
