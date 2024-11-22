package ObjectOrientedProgramming.Constructor;

public class Overloading {
    // By changing the no. of parameters ------>>>
    // int add(int a, int b){
    //     int c= a+b;
    //     return c;
    // }
    // int add(int x, int y, int z){
    //     int v= x+y+z;
    //     return v;
    // }

    // public static void main(String[] args) {
    //     Overloading obj = new Overloading();
    //     int res = obj.add(10, 20);
    //     int res1 = obj.add(15, 25, 35);

    //     System.out.println(res);
    //     System.out.println(res1);
    // }



    //BY CHANGING THE DATA TYPE OF THE PARAMETERS  ------>>>>
    // int add(int a, int b){
    //     int c= a+b;
    //     return c;
    // }

    // float add(float x, float y){
    //     float z = x+y;
    //     return z;
    // }

    // public static void main(String[] args) {
    //     Overloading obj = new Overloading();
    //     int res = obj.add(10,20);
    //     float res1 = obj.add(17.4f, 15.6f);

    //     System.out.println(res);
    //     System.out.println(res1);

    // }
    
    //BY CHANGING THE ORDER OF PARAMETERS
    float add(int a, float b){
        float c= a+b;
        return c;
    }
    float add(float x, int y){
        float z= x+y;
        return z;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        float res = obj.add(10,21.6f);
        float res1 = obj.add(17.4f, 15);

        System.out.println(res);
        System.out.println(res1);
    }

}
