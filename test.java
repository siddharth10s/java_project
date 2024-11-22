public class test 
{
    public static void main(String[] args) 
    {
        test ref1 = new test();
        A ref2= ref1.new A();
        A.C ref3= ref2.new C();

        System.out.println(ref2.j);
        ref2.j= 20;
        System.out.println(ref2.j);
        System.out.println(ref3.siddharth());

        D ref4 = new D();
        System.out.println(ref4.h);

        D.E ref5 = ref4.new E();
        D.E.F ref6 = ref5.new F();

    }

    class A
    {
        int j = 90;
        class C
        {
            double siddharth()
            {
                int h = 67;
                System.out.println(h);
                // siddharth();
                return 90.9;
            }
        }

    }
}

class D
{
    float h =  90.9f;

    class E
    {

        class F
        {

        }

    }
}
