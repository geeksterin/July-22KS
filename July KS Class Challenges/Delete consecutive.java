import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        int n = scn.nextInt();
        
        Stack<String>st=new Stack<>();
        
        for(int i=0;i<n;i++){
            String str=scn.next();
            
            if(st.size()>0 && st.peek().equals(str) ){
                st.pop();
            }else{
                st.push(str);
            }
        }
        
        System.out.println(st.size());
    }
}
