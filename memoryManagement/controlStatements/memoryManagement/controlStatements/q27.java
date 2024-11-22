package memoryManagement.controlStatements;

public class q27 {

    public static void main(String[] args) {
        
        char gender = 'f'; //m or f
        int serviceYear=9;
        char EDU='g'; // p = post-graduate or g = graduate

        if(gender=='m'){
            if(serviceYear>=10 &&EDU=='p'){
                System.out.println("Salary = 15000");
            }
            else if(serviceYear>=10 &&EDU=='g'){
                System.out.println("Salary = 10000");
            }
            else if(serviceYear<10 &&EDU=='p'){
                System.out.println("Salary=10000");
            }
            else if(serviceYear<10 &&EDU=='g'){
                System.out.println("Salary = 7000");
            }
            else{
                System.out.println("Provide the valid information");
            }
        }
        else if(gender=='f'){
            if(serviceYear>=10 &&EDU=='p'){
                System.out.println("Salary = 12000");
            }
            else if(serviceYear>=10 &&EDU=='g'){
                System.out.println("Salary = 9000");
            }
            else if(serviceYear<10 &&EDU=='p'){
                System.out.println("Salary=10000");
            }
            else if(serviceYear<10 &&EDU=='g'){
                System.out.println("Salary = 6000");
            }
            else{
                System.out.println("Provide the vald information");
            }
        }
        else{
            System.out.println("Provide the valid information");
        }
    }
}
