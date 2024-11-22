package memoryManagement.controlStatements;

public class q32 {
    public static void main(String[] args) {
//         32. Given the length and breadth of a rectangle, write a program to find whether the area 
// of the rectangle is greater than its perimeter. For example, the area of the rectangle with 
// length = 5 and breadth = 4 is greater than its perimeter

        int length=10;
        int breadth=5;
        int area=length*breadth;
        int perimeter=2*length+2*breadth;

        // if(area>perimeter){
        //     System.out.println("area is greater than the perimeter");
        // }
        // else{
        //     System.out.println("area is not reater than perrimeter");
        // }

        String X= (area>perimeter)?"area is greater than the perimeter":"area is not reater than perrimeter";
        System.out.println(X);
    }
}
