package ObjectOrientedProgramming.Inheritence;
class AAniaml{
    void sleep(){
        System.out.println("sleeping");
    }
}

class Lion extends AAniaml{
    void roar(){
        System.out.println("roaring");
    }
}

class cub extends Lion{
    void play(){
        System.out.println("playing");
    }
}


public class MultiLevel {
    public static void main(String[] args) {
        Lion obj1= new Lion();
        obj1.sleep();
        obj1.roar();

        cub obj2 = new cub();
        obj2.sleep();
        obj2.roar();
        obj2.play();
    }
}
