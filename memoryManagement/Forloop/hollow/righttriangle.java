import java.util.Scanner;

public class righttriangle 
{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = scn.nextInt();

        for(int r=1; r<=n ; r++)
        {
            for(int c=1 ; c<=r; c++)
            {
                if(c==1 || r==n || r==c)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }  
            }
            System.out.println();
        }
    }
}