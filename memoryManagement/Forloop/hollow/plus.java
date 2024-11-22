import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = scn.nextInt();

        for(int r=1; r<=n ; r++)
        {
            for(int c = 1; c<=n ; c++)
            {
                if(n%2==0)
                {
                    if(c==n/2 || r==n/2){
                    System.out.print("* ");
                    }
                    else{
                    System.out.print("  ");
                    }
                }
                else
                {
                    if(c==n/2+1 || r==n/2+1){
                    System.out.print("* ");
                    }
                    else{
                    System.out.print("  ");
                    }  
                }
            }
            System.out.println();
        }
    }
}
