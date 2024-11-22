package memoryManagement.controlStatements;

public class q24 {
    public static void main(String[] args) {
        
//         24. If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of 
// basic salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 
// 98% of basic salary. If the employee's salary is input through the keyboard write a program 
// to find his gross salary
         
        double basic=1600;
        double gross;
        double DA;
        double HRA;

        if(basic<1500)
        {
            HRA=0.10*basic;
            DA=0.90*basic;
            gross=basic+HRA+DA;
            System.out.println("The gross salary is " + gross);
        }
        else
        {
            HRA=500;
            DA=0.98*basic;
            gross=basic+HRA+DA;
            System.out.println("The gross salary is " + gross);
        }
    }
}
