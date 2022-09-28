import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void desiredString(String str){
        
        int count=0;
        int maxLen=-1;
        String longestString="";
        
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String s="";
                for(int k=i;k<=j;k++){
                    s+=str.charAt(k);
                }
                if(s.length()>1 && s.charAt(0)=='A' && s.charAt(s.length()-1)=='A'){
                    count++;
                    if(maxLen<s.length()){
                        maxLen=s.length();
                        longestString=s;
                    }
                }
                
            }
        }
        if(count==0){
            System.out.println(-1);
        }else {
            System.out.println(count);
            System.out.println(maxLen);
            System.out.println(longestString);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        desiredString(str);
    }
}
