import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        
        //right angled triangle

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r = 1; r<=n ; r++)
        {
          for(int c = 1 ; c<=r ; c++)
          {
            System.out.print("* ");
          }
        System.out.println();   
        }    
    }
}
