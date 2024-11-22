package memoryManagement.array.oneD_array;

// WAP to find a number is prime or not

public class primeNum {

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        int count=0;

        for(int i=2 ; i<=Math.sqrt(num) ; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int x=15;
        
        if(isPrime(x)==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
