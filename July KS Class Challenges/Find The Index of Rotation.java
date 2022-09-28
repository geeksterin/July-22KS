import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int binarySearch(int arr[]){
        
        int low=0;
        int high=arr.length-1;
        
        while(low<high){
            int mid=(low+high)/2;
            
            if(arr[mid]<arr[high]) // mid -> high region sorted
                high=mid;
            else 
                low=mid+1;
        }
        
        return high-1;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=binarySearch(arr);
        System.out.println(ans);
    }
}
