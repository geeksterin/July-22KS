import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        int count=0;
        int maxLen=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                count++;
            }else {
                if(count>maxLen){
                    maxLen=count;
                }
                count=0;
            }
        }
        
        if(count>maxLen){
            maxLen=count;
        }
        
        System.out.println(maxLen);
    }
}
