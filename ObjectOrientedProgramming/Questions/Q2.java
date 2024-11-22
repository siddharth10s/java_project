package ObjectOrientedProgramming.Questions;

//WAP to create a class "Dog" with a name and breed attribute. Create two instances of the "Dog" class,
// set their attributes using constructor and modify the attributes using their setterf methods and
// print the pdated values.

class Dogg{
    String name;
    String breed;

    Dogg(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    void setter(String name, String breed){
        this.name=name;
        this.breed=breed;    
    }
    void displ(){
        System.out.println(name);
        System.out.println(breed);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Dogg d1 = new Dogg("tommy", "german shephard");
        Dogg d2 = new Dogg("max", "pug");
        
        //updating values
        d1.setter("Sheru", "desi");
        d1.displ();
        d2.setter("kaalu", "lab");
        d2.displ();
    }
}
