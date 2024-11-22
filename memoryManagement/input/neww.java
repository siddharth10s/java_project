package memoryManagement.input;

import java.util.Scanner;

public class neww 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name= ");
        String name = sc.next();
        System.out.print("Enter your age= ");
        int age = sc.nextInt();
        System.out.print("Enter your Salary= ");
        int Salary = sc.nextInt();

        System.out.println(name);
        System.out.println(age);
        System.out.println(Salary);
    }
     
}
