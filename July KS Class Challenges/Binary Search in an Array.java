import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int binarySearch(int arr[],int x){
        
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                high=mid-1;
            }else {
                low=mid+1;
            }
            
        }
        
        return -1;
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
        
        
        int ans=binarySearch(arr,x);
        System.out.println(ans);
    }
}
