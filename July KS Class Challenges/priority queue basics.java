import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<t;i++){
            int x=scn.nextInt();
            
            min=Math.min(min,x);
            
            System.out.println(min);
            
        }
    }
}
