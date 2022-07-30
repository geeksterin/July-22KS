import java.io.*;
import java.util.*;

public class Solution {
    
    public static void swap(int x,int y){
        // Step-1
        int c=x;
        System.out.println("c = "+c);
        
        // Step-2
        x=y;
        System.out.println("x = "+x);
        
        // Step-3
        y=c;
        System.out.println("y = "+y);
        
        // Print
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        swap(x,y);
        
    }
}
