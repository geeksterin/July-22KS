import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void prefixMax(int arr[]){
        int n=arr.length;
        
        int prefix[]=new int[n];
        
        prefix[0]=arr[0];
        
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],arr[i]);
        }
        
        for(int i=0;i<n;i++){
            System.out.println(prefix[i]);
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
        
        prefixMax(arr);
    }
}
