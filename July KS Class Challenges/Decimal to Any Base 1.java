import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int base=scn.nextInt();
        
        int ans=0;
        int pow=1;
        
        while(n>0){
            
            int rem=n%base;
            
            ans=ans+(rem*pow);
            
            n/=base;
            
            pow*=10;
        }
        
        System.out.println(ans);
    }
}
