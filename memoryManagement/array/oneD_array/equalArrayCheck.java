package memoryManagement.array.oneD_array;

//write arogram to check if boh the arrays are equal or not

public class equalArrayCheck {

    static boolean sameArray(int [] a, int []b){
        if(a.length!=b.length){
            return false;
        }
        
        for(int i=0; i<a.length ; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int [] a= {10,20,30};
        int [] b = {10,20,40};

        boolean res = sameArray(a, b);
        if(res == true){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT EQUAL");
        }
    }
}
