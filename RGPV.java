public class RGPV 
{
    int A=15;
    void a()
    {
        System.out.println("CLASS= RGPV... A = " + A);
        A = 20;
        System.out.println("new A = " + A);
    }
    public static void main(String[] args) 
    {
        RGPV ref1 = new RGPV();
        UIT ref2 = ref1.new UIT();
        UIT.CSE ref3 = ref2.new CSE();
        UIT.ECE ref4 = ref2.new ECE();
        UIT.ME ref5 = ref2.new ME();
        
        RGPV2 nRef1 = new RGPV2();
        RGPV2.SOIT nRef2 = nRef1.new SOIT();
        RGPV2.SOIT.CSBS nRef3 = nRef2.new CSBS();
        RGPV2.SOIT.AIML nRef4 = nRef2.new AIML();
        RGPV2.SOIT.DS nRef5 = nRef2.new DS();

    }
 
    class UIT
    {

        class CSE
        {

        }
        class ECE
        {

        }
        class ME
        {

        } 
    }
}

class RGPV2
{
    class SOIT
    {
        class CSBS
        {

        }
        class AIML
        {

        }
        class DS
        {

        }
    }
}
