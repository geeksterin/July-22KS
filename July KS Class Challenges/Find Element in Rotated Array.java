import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(arr[mid]==key){
                return mid;
            }
            
            else if(arr[low]<=arr[mid]){
//                 left range is sorted
                
                if(arr[low]<=key && key<arr[mid]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }else {
                
//                 right range is sorted
                if(arr[mid]<key && key<=arr[high]){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
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
        
        int k=scn.nextInt();
        
        int ans=binarySearch(arr,k);
        System.out.println(ans);
    }
}
