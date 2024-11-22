public class indVsSL 
{
    int virat;
    int gill;
    
    indVsSL(int X, int Y)
    {
        virat=X;
        gill=Y;
    }
    indVsSL(){

    }
    

    void india()
    {  
       indVsSL bat= new indVsSL(88,92);
       System.out.println(bat.virat);
       System.out.println(bat.gill);

    }
    
    public static void main(String[] args) {
        indVsSL a= new indVsSL();
        a.india();
        SL.sriLanka();

}
}
class SL{
    int bumrah;
    int shami;

    SL(int c, int d){
        bumrah=c;
        shami=d;
    }

    static void sriLanka()
    {
        SL ball = new SL(1,5);
        System.out.println(ball.bumrah);
        System.out.println(ball.shami);
    }

}
