package memoryManagement;

public class Static
{
    public static void main(String[] args) {
        System.out.println(vikas.siddharth());
        System.out.println("this is in static");
        boolean r= ram();
        System.out.println(r);
    }

    static boolean ram(){
        System.out.println("ram");
        return true;
    }
    
}

class vikas{

    public static void main(String[] args) {
        System.out.println("this is in class vikas");
        int a=siddharth();
        System.out.println(a);
    }

    static int siddharth(){

        int x=31;
        System.out.println(x);
        return 10;
    }
}

class sid{
    

}


