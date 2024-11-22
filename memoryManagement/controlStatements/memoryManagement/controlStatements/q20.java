package memoryManagement.controlStatements;

public class q20 {
    public static void main(String[] args) {
        // 20. Write a program to input basic salary of an employee and calculate its Gross salary 
        // according to following:
        //   • Basic Salary <= 10000 : HRA = 20%, DA = 80%
        //   • Basic Salary <= 20000 : HRA = 25%, DA = 90%
        //   • Basic Salary > 20000 : HRA = 30%, DA = 95%
        //  answer:-gross salary= basic salary + hra + da

        double basic=30000;
        double HRA;
        double DA;
        double gross;
        
        if(basic<=10000){
            HRA=0.20*basic;
            DA=0.80*basic;
            gross=basic+DA+HRA;
            System.out.println("Gross salary is " + gross);
        }
        else if(basic<=20000){
            HRA=0.25*basic;
            DA=0.90*basic;
            gross=basic+DA+HRA;
            System.out.println("Gross salary is " + gross);
        }
        else {
            HRA=0.30*basic;
            DA=0.95*basic;
            gross=basic+DA+HRA;
            System.out.println("Gross salary is " + gross);
        }
    }
}

