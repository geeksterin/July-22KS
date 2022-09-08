import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void digitFreq(int n){
        
        int freq[]=new int[10];
        
        while(n>0){
            int lastDigit=n%10;
            freq[lastDigit]++;
            n/=10;
        }
        
        int maxCount=0;
        int ans=0;
        
        for(int i=0;i<10;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                ans=i;
            }
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        digitFreq(n);
    }
}
