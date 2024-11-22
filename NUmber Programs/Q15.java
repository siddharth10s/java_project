//15.	WAP to print sum of digits of a given number
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();
        int sum=0; 

        while(n>0){
            int rem = n % 10;
            sum = sum + rem;
            System.out.print(rem);
            n = n/10;
        }
        System.out.println();
        System.out.println(sum);

        scn.close();
    }
}
