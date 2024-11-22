public class triangle {
    public static void main(String[] args) {
        int n=5;

        for(int r=1; r<=n; r++)
        {
            for(int c=1; c<=n-r;c++)
            {
                System.out.print("  ");
            }
            for(int c=1; c<=r;c++)
            {
                System.out.print(r + " ");
            }
            for(int c=2;c<=r; c++)
            {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
