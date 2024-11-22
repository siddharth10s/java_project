import java.util.Scanner;

public class cross {
     public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = scn.nextInt();

        for(int r=1; r<=n ; r++)
        {
            for(int c = 1; c<=n ; c++)
            {
                if(c==r || r+c==n+1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

