package memoryManagement;

public class NewSatic {

    int age;
    String name;
    String clg;
    
    NewSatic(int x, String y, String z) // constructor of NewStaic class
    {
        age=x;
        name=y;
        clg=z;
    }
    public static void main(String[] args) 
    {
        NewSatic ram = new NewSatic(21, "ram", "LNCT");
        NewSatic shyam = new NewSatic(20, "shyam", "SOIT" );
        NewSatic mohan = new NewSatic(22, "mohan", "UIT");

        System.out.println(ram.age);
        System.out.println(ram.name);
        System.out.println(ram.clg);

        System.out.println(shyam.age);
        System.out.println(shyam.name);
        System.out.println(shyam.clg);
        
        System.out.println(mohan.age);
        System.out.println(mohan.name);
        System.out.println(mohan.clg);
        
    }


}

class Ct
{

    Ct() // constructor of Ct class
    {

    }

    class Tc
    {
        Tc() // constructor of Tc class
        {

        }

    }

}
