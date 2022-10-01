import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String binaryRepresentation(char digit){
        
        if(digit=='0') return "000";
        
        else if(digit=='1') return "001";
        
        else if(digit=='2') return "010";
        
        else if(digit=='3') return "011";
        
        else if(digit=='4') return "100";
        
        else if(digit=='5') return "101";
        
        else if(digit=='6') return "110";
        
        else  return "111";
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        String str=n+"";
        
        String ans="";
        
        for(int i=0;i<str.length();i++){
            char digit=str.charAt(i);
            ans+=binaryRepresentation(digit);
        }
        
        
        
        System.out.println(ans);
    }
}
