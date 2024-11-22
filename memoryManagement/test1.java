package memoryManagement;

public class test1 
{
    public static void main(String[] args) 
    {
        int marks=66;
        
        if(marks>=33){
            System.out.println("pass");
            
            if(marks>=80){
                System.out.println("1st grade");
            }
            else if(marks<80 && marks>=60){
                System.out.println("2nd grade");
            }
            else{
                System.out.println("3rd grade");
            }
        }
       
        else{
            System.out.println("fail");
        }
    }
}
