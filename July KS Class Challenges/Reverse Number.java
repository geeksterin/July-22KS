import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int t=scn.nextInt();
        
        
        for(int i=1;i<=t;i++){
            int num=scn.nextInt();
            String str=num+"";
            
            Stack<Character>st=new Stack<>();
            
            for(int j=0;j<str.length();j++){
                st.push(str.charAt(j));
            }
            
            while(st.size()>0 &&st.peek()=='0'){
                st.pop();
            }
            
            while(st.size()>0){
                System.out.print(st.pop());
            }
            System.out.println();
            
        }
        
    }
}
