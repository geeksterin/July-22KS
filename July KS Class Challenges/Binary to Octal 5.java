import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int binaryToOctal(int n){
        
        int ans=0;
        int pow=1;
        
        while(n>0){
            int digit=n%8;
            
            ans=ans+(digit*pow);
            
            n/=8;
            pow*=2;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int ans=binaryToOctal(n);
        System.out.println(ans);
        
    }
}
