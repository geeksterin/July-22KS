import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean validBracket(String str){
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }else {
                    return false;
                }
                
            }
        }
        
        if(st.size()==0){
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.nextLine();
        
        boolean ans=validBracket(str);
        
        System.out.println(ans);
    }
}
