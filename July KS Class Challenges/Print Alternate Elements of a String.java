import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        
        for(int i=0;i<str.length();i+=2){
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}
