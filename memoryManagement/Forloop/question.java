import java.util.Scanner; 
public class question {

    public static void main(String[] args) {
        System.out.println("Enter total number of variables");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        
        for(int i = 1; i<=number; i++)
        {
            System.out.println("enter the name of variable " + i);
            String name = scn.next();
            

            System.out.println("Enter the data type of variable " + i);
            String datatype = scn.next();
            
            
        }

    }
}
