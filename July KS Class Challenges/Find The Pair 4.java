import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void pairSum(int arr[],int x){
        
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int x=scn.nextInt();
        
        pairSum(arr,x);
    }
}
