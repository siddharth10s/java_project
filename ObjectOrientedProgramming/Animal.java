package ObjectOrientedProgramming;

public class Animal {
    
    void eat(){
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Animal Dog = new Animal();
        Dog.eat();
    }
}
