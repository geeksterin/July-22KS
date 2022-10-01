import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int addDigits(int n){
        int ans=0;
        
        while(n>0){
            int rem=n%10;
            
            ans+=rem;
            
            n/=10;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        while(n>9){
            int ans=addDigits(n);
            
            n=ans;
            
        }
        
        System.out.println(n);
    }
}
