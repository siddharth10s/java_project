public class object1
{

    public static void main(String[] args) 
    {
        object1 a = new object1();
        object2 b = new object2();
        object2.object1 c = b.new object1();
    }
    
}

class object2
{
    public static void main(String[] args)
    {
        object2 x = new object2();
        object1 y = x.new object1();
    }
    class object1{

    }
}
