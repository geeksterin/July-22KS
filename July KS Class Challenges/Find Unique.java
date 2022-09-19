import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int countUniqueDigits(String str){
        
        int freq[]=new int[10];
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'0']++;
        }
        
        int count=0;
        
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        int ans=countUniqueDigits(str);
        System.out.println(ans);
    }
}
