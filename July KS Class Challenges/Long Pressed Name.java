import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean longPressed(String name,String typed){
        
        if(name.length()>typed.length()){
            return false;
        }
        
        int i=0;
        int j=0;
        
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
                
            }else if(i>0 && name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else {
                return false;
            }
        }
        
        while(j<typed.length()){
            if(name.charAt(i-1) !=typed.charAt(j)){
                return false;
            }
            j++;
        }
        
        
        return(i==name.length()?true:false);
        
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String name=scn.nextLine();
        String typed=scn.nextLine();
        
        boolean ans=longPressed(name,typed);
        System.out.println(ans);
    }
}
