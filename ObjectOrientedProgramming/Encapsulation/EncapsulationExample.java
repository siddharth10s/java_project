//package ObjectOrientedProgramming.Encapsulation;


class Bank{
    String name;
    String address;
    private int PIN;

    Bank(String name , String address){
        this.name=name;
        this.address=address;    
    }
    public int getPIN(){
        return PIN;
    }
    public void setPIN(int pIN){
        if(pIN>999){
            PIN=pIN;
        }
        else{
            System.out.println("Enter 4 digit number");
        }
    }
}
public class EncapsulationExample {

    public static void main(String[] args) {
        Bank SBI = new Bank("Tinku", "nagpur ");
        SBI.setPIN(4563);
        System.out.println(SBI.getPIN());
    }
}
//WAP to take a class book with title, name of author, number of pages.