public class age {
    public static void main(String[] args) {
        int age= 25;

        if (age<18){
            throw new ArithmeticException("Age below 18")
        }
        else{
            System.out.println("Approved for DL");
        }
    }
}
