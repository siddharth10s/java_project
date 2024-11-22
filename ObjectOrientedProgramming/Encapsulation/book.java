package ObjectOrientedProgramming.Encapsulation;
class que{
    String title;
    String authName;
    private int numPages;

    que(String title, String authName){
        this.title=title;
        this.authName=authName;
    }
    public int getPages(){
        return numPages;
    } 
    public void setPages(pgs){
        if(pgs>0){
            numPages=pgs;
        }
        else{
            System.out.println("wrong input");
        }
    }
}
public class book {
 public static void main(String[] args) {
    
 }   


}
