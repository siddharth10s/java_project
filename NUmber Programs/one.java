// WAP to extract each digit from a given number
import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scn.nextInt();

        while(n>0){
            int rem = n % 10;
            System.out.println(rem);
            n = n/10;
        }
        scn.close();
    }    
}
