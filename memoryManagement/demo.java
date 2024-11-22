package memoryManagement;

public class demo 
{
    public static void main(String[] args) {
        boolean w= newDemo.sid();
        System.out.println(w);
        int a= ram();
        System.out.println(a);
    }

    static int ram(){
        System.out.println("class is demo");
        return 10;
    }
}

class newDemo{

    public static void main(String[] args) 
    {
        int t= demo.ram();
        System.out.println(t);
        boolean y= sid();
        System.out.println(y);
    }

    static boolean sid(){
        System.out.println("class newDemo");
        return true;
    }
}
