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
        
        int freq[]=new int[26];
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int index=0;
            if(ch!=' '){
                
                if(ch>='a' && ch<='z') index=ch-'a';
                else if(ch>='A' && ch<='Z') index=ch-'A';
            }
            
            freq[index]++;
        }
        
        
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                System.out.println("NO");
                return ;
            }
        }
        
        System.out.println("YES");
    }
}
