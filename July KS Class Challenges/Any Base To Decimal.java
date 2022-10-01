import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int anyBaseToDecimal(String str,int base){
        
        int ans=0;
        int pow=1;
        
        int i=str.length()-1;
        
        while(i>=0){
            
            char ch=str.charAt(i);
            int digit=0;
            if(ch>='A' && ch<='Z'){
                digit=ch-'A'+10;
            }else {
                digit=ch-'0';
            }
            
            ans=ans+(digit*pow);
            
            i--;
            
            pow*=base;
        }
        
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        
        int base=scn.nextInt();
        
        int ans=anyBaseToDecimal(str,base);
        
        System.out.println(ans);
    }
}
