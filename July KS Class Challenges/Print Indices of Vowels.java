import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                System.out.print(i+" ");
            }
        }
    }
}
