import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void maxFreq(String str){
        
        int n=str.length();
        int freq[]=new int[26];
        
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int index=ch-'a';
            
            freq[index]++;
        }
        
        
        int maxCount=0;
        char ans='a';
        
        for(int i=0;i<26;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                ans=(char)(i+'a');
            }
        }
        
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        
        maxFreq(str);
    }
}
