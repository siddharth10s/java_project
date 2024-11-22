package memoryManagement.controlStatements;

public class q12 
{
    public static void main(String[] args) {
        //12. Write a program to input month number and print month Name

        int month=4;

        if(month==1){
            System.out.println("JANUARY");
        }
        else if(month==2){
            System.out.println("FEBRUARY");
        }
        else if(month==3){
            System.out.println("MARCH");
        }
        else if(month==4){
            System.out.println("APRIL");
        }
         else if(month==5){
            System.out.println("MAY");
        }
         else if(month==6){
            System.out.println("JUNE");
        }
         else if(month==7){
            System.out.println("JULY");
        }
         else if(month==8){
            System.out.println("AUGUST");
        }
         else if(month==9){
            System.out.println("SEPTEMBER");
        }
         else if(month==10){
            System.out.println("OCTOBER");
        }
         else if(month==11){
            System.out.println("NOVEMBER");
        }
         else if(month==12){
            System.out.println("DECEMBER");
        }
         else {
            System.out.println("INVALID, Enter a value between 1 to 12");
        }

        String a= (month==1)?"JANUARY":(month==2)?"FEBRUARY":(month==3)?"MARCH":(month==4)?"APRIL":(month==5)?"MAY":(month==6)?"JUNE":(month==7)?"JULY":(month==8)?"AUGUST":(month==9)?"SEPTEMBER":(month==10)?"OCTOBER":(month==11)?"NOVEMBER":(month==12)?"DECEMBER":"INVALID, Enter a value between 1 to 12";
        System.out.println(a);

    }
}
