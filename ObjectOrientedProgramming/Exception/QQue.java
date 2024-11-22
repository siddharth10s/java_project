//package ObjectOrientedProgramming.Exception;

public class QQue {
    
    public static void main(String[] args) {
        
        try {
            int a=10/0;
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Code executed");
    }
}
