public class nested 
{
    int h = 10;
    String 

    int i()
    {
        System.out.println("i");
        return 20;
    }

    public static void main(String[] args) 
    {
        int f= 90;
        System.out.println(f);

        nested r1 = new nested();
        System.out.println(r1.h);
        r1.i();

        a.n();
        a r2 = new a();
        System.out.println(r2.j);
        r2.k();

        a.b r3 = r2.new b();
        System.out.println(r3.l);
        r3.m();

    }    
}

class a
{
    int j = 30;
    static int n()
    {
        System.out.println("static n");
        return 50;
    }
    
    int k()
    {
        System.out.println("k");
        return 100;
    }

    class b
    {
        int l = 40;
        int m()
        {
            System.out.println("m");
            return 90;
        }
    }
}
