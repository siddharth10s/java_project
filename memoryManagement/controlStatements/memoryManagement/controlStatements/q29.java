package memoryManagement.controlStatements;

public class q29 
{
    public static void main(String[] args) {
//         29. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to 
// determine the youngest of the three
        int ram=19;
        int shyam=16;
        int ajay=11;

        // if(ram<shyam){
        //     if(ram<ajay){
        //         System.out.println("ram is the youngest.");
        //     }
        //     else{
        //         System.out.println("ajay is the youngest");
        //     }
        // }
        // else{
        //     if(shyam<ajay){
        //         System.out.println("shyam is the youngest");
        //     }
        //     else{
        //         System.out.println("ajay is the youngest");
        //     }
        // }

        String X= (ram<shyam)?(ram<ajay)?"ram is the youngest.":"ajay is the youngest":
        (shyam<ajay)?"shyam is the youngest":"ajay is the youngest";
        System.out.println(X);

    }
    
}
