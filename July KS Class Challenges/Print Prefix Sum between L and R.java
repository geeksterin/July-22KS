import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int [] prefixSum(int arr[],int l,int r){
        
        int n=arr.length;
        int prefix[]=new int[n];
        
        prefix[0]=arr[0];
        
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        
        return prefix;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        
        
        int l=scn.nextInt();
        int r=scn.nextInt();
        
        int []prefix=prefixSum(arr,l,r);
        
        for(int i=l;i<=r;i++){
            System.out.println(prefix[i]);
        }
    }
}
