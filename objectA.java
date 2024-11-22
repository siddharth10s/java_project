public class objectA {
    
    static int x()
    {

        return 10;
    }

    int y()
    {

        return 20;
    }
    public static void main(String[] args) 
    {
        objectA ref1 = new objectA();
        x();
        ref1.y();
        objectB ref2 = ref1.new objectB();
        objectB.objectC ref3 = ref2.new objectC(); 
        
        H h = new H();
        H.K k = h.new K();
        System.out.println(h.p);
        
    }

    class objectB
    {
        class objectC
        {

        }

    }
}

class H
{
    int p=2;
    class K
    {


    }
}


