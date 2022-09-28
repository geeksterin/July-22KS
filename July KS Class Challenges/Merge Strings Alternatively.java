import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str1=scn.nextLine();
        String str2=scn.nextLine();
        
        String ans="";
        
        for(int i=0;i<str1.length();i++){
            ans+=str1.charAt(i);
            ans+=str2.charAt(i);
        }
        
        System.out.println(ans);
    }
}
