
public class new1 {
    public static void main(String[] args) 
    {
        int n=5;

        // for(int r=1; r<=n; r++ )
        // {
        //     for(int c=1;c<=r; c++)
        //     {
        //         System.out.print( 2*r -1 + " ");
        //     }
        //     System.out.println();
        // }
        for(int r=1, p=1; r<=n; r++, p+=2 )
        {
            for(int c=1;c<=r; c++)
            {
                System.out.print(p + " ");
            }
            System.out.println();
        }

        
        

        for(int r=2; r<=n; r++ )
        {
            for(int c=r;c<=n; c++)
            {
                System.out.print(2*(n-r+1) -1 + " ");
            }
            System.out.println();
        }
        // for(int r=2,p=2*(n-1)-1; r<=n; r++,p-=2 )
        // {
        //     for(int c=r;c<=n; c++)
        //     {
        //         System.out.print(p + " ");
        //     }
        //     System.out.println();
        // }
    }
}
