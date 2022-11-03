import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans[]=new int[n];
        
        ans[0]=1;
        
        Stack<Integer>st=new Stack<>();
        
        st.push(0);
        
        for(int i=1;i<n;i++){
            
            while(st.size()>0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            
            if(st.size()==0){
                ans[i]=i+1;
            }else {
                ans[i]=i-st.peek();
            }
            
            st.push(i);
        }
        
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        
        
    }
}
