public class practiceClass {
    
    public static void main(String[] args) 
    {
        System.out.println(Zone1.x);
        Zone1.x= 50;
        System.out.println(Zone1.x);

        Zone1 ref = new Zone1();
        System.out.println(ref.y);
        ref.y=20;
        System.out.println(ref.y);
    }
}

class Zone1
{
    static int x=90; // static (and non-instance) variable

    int y=10; //instance variable

}
