import java.util.Scanner;

public class Thirtyfour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=2 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            for(int j=1, num=n-i; j<=n-i ; j++, num--){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
