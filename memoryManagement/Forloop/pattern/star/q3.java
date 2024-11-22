import java.util.Scanner;

public class q3

{
    public static void main(String[] args) 
    {       
        //inverted right angle triangle.
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r = 1; r<=n ; r++)
        {
          for(int c = 1 ; c<=n-r+1 ; c++)
          {
            System.out.print("* ");
          }
        System.out.println();   
        }    
    }
}
