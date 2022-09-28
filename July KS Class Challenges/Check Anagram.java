import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        String str1=scn.nextLine();
        String str2=scn.nextLine();
        
        int freq[]=new int[26];
        if(str1.length()!=str2.length()){
            System.out.println("False");
            return ;
        }
        
        for(int i=0;i<str1.length();i++){
            int index=str1.charAt(i)-'a';
            freq[index]++;
        }
        
        
        for(int i=0;i<str2.length();i++){
            int index=str2.charAt(i)-'a';
            freq[index]--;
        }
        
        
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println("False");
                return ;
            }
        }
        
        System.out.println("True");
    }
}
