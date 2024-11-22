import java.util.Scanner;

public class hill {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();

        for(int r=1 ; r<=n ; r++)
        {
            for(int c=1; c<=n-r ; c++)
            {
                System.out.print(" ");
            }
            for(int c=1 ; c<= 2 * r - 1 ; c++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
