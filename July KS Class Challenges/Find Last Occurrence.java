import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int lastOccurence(int arr[],int x){
        
        int low=0;
        int high=arr.length-1;
        
        int ans=-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else {
                low=mid+1;
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
        
        int x=scn.nextInt();
        
        int ans=lastOccurence(arr,x);
        System.out.println(ans);
    }
}
