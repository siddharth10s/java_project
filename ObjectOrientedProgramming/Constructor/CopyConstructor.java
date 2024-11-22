package ObjectOrientedProgramming.Constructor;

public class CopyConstructor {
    String name;
    String address;
    CopyConstructor(String name, String address){
        this.name=name;
        this.address=address;
    }    
    CopyConstructor(CopyConstructor x){
        this.name=x.name;
        this.address=x.address;
    }
    void disp(){
        System.out.println(name);
        System.out.println(address);
    }
    public static void main(String[] args) {
        CopyConstructor obj = new CopyConstructor("kalu" , "bhopal");
        CopyConstructor obj1 = new CopyConstructor(obj);
        obj1.disp();
    }
}
