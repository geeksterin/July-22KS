import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static int storeMaximum(int arr[]){
        int n=arr.length;
        int ans=0;
        if(n<=2){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            int left_max=arr[i];
            
            for(int j=i-1;j>=0;j--){
                if(left_max<arr[j]){
                    left_max=arr[j];
                }
            }
            
            int right_max=arr[i];
            for(int j=i+1;j<n;j++){
                if(right_max<arr[j]){
                    right_max=arr[j];
                }
            }
            
            int minimum=0;
            
            if(left_max<right_max){
                minimum=left_max;
            }else {
                minimum=right_max;
            }
            
            ans+=minimum-arr[i];
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=storeMaximum(arr);
        
        System.out.println(ans);
    }
}
