import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int nonMatchingValue(int a1[],int a2[]){
        
        int n=a1.length;
        
        for(int i=0;i<n;i++){
            if(a1[i]!=a2[i]){
                return i;
            }
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int a1[]=new int[n];
        
        for(int i=0;i<n;i++){
            a1[i]=scn.nextInt();
        }
        
        int a2[]=new int[n];
        
        for(int i=0;i<n;i++){
            a2[i]=scn.nextInt();
        }
        
        int ans=nonMatchingValue(a1,a2);
        
        System.out.println(ans);
    }
}
