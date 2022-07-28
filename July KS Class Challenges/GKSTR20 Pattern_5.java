import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        for(int i=1;i<=n;i++){
            
            // Spaces 
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            
            // Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
