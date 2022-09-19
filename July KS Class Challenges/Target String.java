import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str1=scn.next();
        String str2=scn.next();
        
        str1=str1+str1;
        
        if(str1.indexOf(str2)!=-1){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
