public class objectPractice
{
    String state; // instance variable
    String capital;  // instance variable

    objectPractice(String X, String Y)   //parameterized constructor of class objectPractice
    {             // X and Y are the parameters.
        state= X;  // data of x is asssign to state(instance variale)
        capital=Y;  // data of x is asssign to capital(instance variale)
    }

    public static void main(String[] args) 
    {
        objectPractice MP=new objectPractice("MP", "bhopal"); // creating new object MP to pass the arguments(values of state and capital) 
        objectPractice Maharashtra=new objectPractice("Maharashtra", "Mumbai"); // creating new object Maharashtra to pass the arguments(values of state and capital) 

        System.out.println(MP.state);  // printing the value of state i.e X from object MP
        System.out.println(MP.capital); // printing the value of capital i.e X from object MP
        
        System.out.println(Maharashtra.state); // printing the value of state i.e X from object Maharashtra
        System.out.println(Maharashtra.capital); // printing the value of capital i.e X from object Maharashtra

    }
    
}