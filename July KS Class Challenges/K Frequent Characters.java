import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void highestKFrequencyCharacter(String str,int k){
        
        int freq[]=new int[26];
        
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch>='a' && ch<='z'){
                int index=ch-'a';
                freq[index]++;
            }else if(ch>='A' && ch<='Z'){
                int index=ch-'A';
                freq[index]++;
            }
        }
        
        
        for(int i=1;i<=k;i++){
            int max=0;
            char ch='a';
            int index=0;
            
            for(int j=0;j<26;j++){
                if(freq[j]>max){
                    max=freq[j];
                    ch=(char)(j+'a');
                    index=j;
                }
            }
            
            System.out.print(ch+" ");
            freq[index]=-1;
            
            
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.nextLine();
        
        int k=scn.nextInt();
        
        highestKFrequencyCharacter(str,k);
    }
}
