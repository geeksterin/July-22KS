import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer>st=new Stack<>();
        
        Scanner scn=new Scanner(System.in);
        
        int t=scn.nextInt();
        
        for(int i=1;i<=t;i++){
            int c=scn.nextInt();
            
            if(c==1){
                System.out.println(st.size());
            }
            else if(c==2){
                if(st.size()==0){
                    System.out.println(-1);
                }else {
                    st.pop();
                }
            }
            else if(c==3){
                int x=scn.nextInt();
                st.push(x);
            }
            else if(c==4){
                if(st.empty()==true){
                    System.out.println(-1);
                }else {
                    System.out.println(st.peek());
                }
            }
        }
    }
}
