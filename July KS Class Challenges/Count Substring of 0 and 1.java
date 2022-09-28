import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkConsecutive(String str){
        
        if(str.length()==1){
            return false;
        }
        
        int countCh1=1;
        int i=1;
        char ch1=str.charAt(0);
        
        while(i<str.length() && ch1==str.charAt(i)){
            countCh1++;
            i++;
        }
        
        if(i==str.length()){
            return false;
        }
        
        int countCh2=1;
        char ch2=str.charAt(i);
        i+=1;
        
        while(i<str.length() && ch2==str.charAt(i)){
            countCh2++;
            i++;
        }
        
        if(countCh1!=countCh2){
            return false;
        }
        
        if(i==str.length()){
            return true;
        }
        
        return false;
        
        
    }
    
    
    public static void countSubstring(String str){
        
        int ans=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String substring="";
                for(int k=i;k<=j;k++){
                    substring+=str.charAt(k);
                }
                boolean check=checkConsecutive(substring);
                if(check==true){
                    ans++;
                }
            }
        }
        
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        countSubstring(str);
    }
}
