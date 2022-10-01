import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int multiplication(int n){
        int ans=1;
        while(n>0){
            int rem=n%10;
            ans*=rem;
            
            n/=10;
            
        }
        
        return ans;
    }
    
    public static int addition(int n){
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
        int product=multiplication(n);
        int add=addition(n);
        
        System.out.println(product-add);
    }
}
