import java.io.*;
import java.util.*;

public class Solution {
    
//     public static int findSum(int x,int y){
//         int c=x+y;
        
//         return c;
//     }
    
    public static void findSum(int x,int y){
        int c=x+y;
        
        System.out.println(c);
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        findSum(x,y);
        
        
       
        
    }
}
