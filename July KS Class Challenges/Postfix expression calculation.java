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
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch>='0' && ch<='9'){
                st.push(ch-'0');
            }else {
//                 +,-,*,/
                
                int op2=st.pop();
                int op1=st.pop();
                
                if(ch=='+'){
                    st.push(op1+op2);
                }else if(ch=='-'){
                    st.push(op1-op2);
                }else if(ch=='*'){
                    st.push(op1*op2);
                }else {
                    st.push(op1/op2);
                }
            }
        }
        
        System.out.println(st.peek());
    }
}
