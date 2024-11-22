import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        for(int r = 1 ; r<=n ; r++ )
        {

            for(int c = 1 ; c<=n/2-r+1 ; c++)
            {
            System.out.print("* ");
            }
            for(int c = n/2+1 ; c<=r ; c++)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
