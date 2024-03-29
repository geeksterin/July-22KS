import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int binarySearch(int n){
        int low=1;
        int high=n;
        int ans=-1;
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                high=mid-1;
            }else {
                ans=mid;
                low=mid+1;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        
        int ans=binarySearch(n);
        
        System.out.println(ans);
    }
}
