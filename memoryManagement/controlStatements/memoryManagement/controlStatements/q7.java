package memoryManagement.controlStatements;

public class q7 {
    public static void main(String[] args) {
        
        //7. Write a program to check whether a character is alphabet or not

        char alphabet='d';
        // if((alphabet>='a' && alphabet<='z')||(alphabet>='A' && alphabet<='Z')){
        //     System.out.println(alphabet + " is an alphabet");
        // }
        // else
        // {
        //     System.out.println(alphabet + " is not an alphabet");
        // }

        String a= ((alphabet>='a' && alphabet<='z')||(alphabet>='A' && alphabet<='Z')) ? alphabet + " is an alphabet":alphabet + " is not an alphabet";
        System.out.println(a);
    }
    
}
