package memoryManagement.Forloop.pattern.star;

import java.util.Scanner;
public class swastik {
    public static void main(String[] args) {
        int n=9;
        int m=n/2;
    
            for(int r= 1; r<=n; r++){
                for(int c=1 ; c<=n ; c++)
                {
                    if(c==1 && r<=m|| r==1 && c>m+1 || c==n && r>m+1 || r==n && c<=m|| c==m+1 || r==m+1){
                    System.out.print("* ");
                    }
                    
                    else{
                        System.out.print("  ");
                    }
                }
                
                System.out.println();
            }
        }
}
