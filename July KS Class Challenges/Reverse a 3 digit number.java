import java.io.*;
import java.util.*;

public class Solution {
    
    public static int reverseNumber(int n){
        int ans=0;
        
        while(n>0){
            int lastDigit=n%10;
            ans=ans*10+lastDigit;
            n/=10;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int ans=reverseNumber(n);
        
        System.out.println(ans);
        
        
    }
}
