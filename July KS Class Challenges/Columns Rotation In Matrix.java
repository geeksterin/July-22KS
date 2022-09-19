import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String checkMatrix(int arr[][]){
        int n=arr.length;
        
        String str="";
        for(int j=0;j<n;j++){
            str+=arr[j][0];
        }
        
        str=str+str;
        
        
        for(int j=1;j<n;j++){
            String curr="";
            for(int i=0;i<n;i++){
                curr+=arr[i][j];
            }
            if(str.indexOf(curr)==-1){
                return "false";
            }
        }
        
        return "true";
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        String ans=checkMatrix(arr);
        
        System.out.println(ans);
    }
}
