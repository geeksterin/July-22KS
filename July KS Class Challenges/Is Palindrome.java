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
        
        int left=0;
        int right=str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("Not a Palindrome");
                return ;
            }
            left++;
            right--;
        }
        
        System.out.println("Palindrome");
    }
}
