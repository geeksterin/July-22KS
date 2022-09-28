import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String ans(String str){
        
        
        int freq[]=new int[26];
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int index=ch-'a';
            
            freq[index]++;
        }
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int index=ch-'a';
            if(freq[index]==1){
                
                return ch+"";
            }
        }
        
        
        return "-1";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(ans(str));
        
    }
}
