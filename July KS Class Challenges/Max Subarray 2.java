import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int  printSubarrays(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    // System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                
                // System.out.println();
                
                if(sum>ans){
                    ans=sum;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=printSubarrays(arr);
        System.out.println(ans);
    }
}
