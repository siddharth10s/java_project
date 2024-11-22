public class LNCT
{
    public static void main(String[] args) 
    {
        LNCT a= new LNCT();
        LEC b= a.new LEC();
        LME c= a.new LME();

        JNCT d = new JNCT();
        JNCT.JCS e = d.new JCS();
        JNCT.JAU f = d.new JAU();

    }
    
    class LEC
    {
        int X= 50;
        void x()
        {
            System.out.println("LNCT-LEC");
        }
           
    }

    class LME
    {
        int Y= 60;
        void y()
        {
            System.out.println("LNCT-LME");
        }
    }
    
}

class JNCT
{
    class JCS
    {
        int Y= 60;
        void z()
        {
            System.out.println("JNCT-JCS");
        }
    }
    class JAU
    {
         int W= 60;
        void w()
        {
            System.out.println("JNCT-JAU");
        }
    }
    
}
