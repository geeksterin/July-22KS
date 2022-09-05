import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void printFrequency(String str){
        int n=str.length();
        
        int freq[]=new int[26];
        
        boolean flag[]=new boolean[26];
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            
            int index=ch-'a';
            
            freq[index]++;// freq[index]=freq[index]+1;
        }
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int index=ch-'a';
            
            if(flag[index]==false){
                System.out.println(ch+"-"+freq[index]);
                flag[index]=true;
            }
            
            
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        
        printFrequency(str);
    }
}
