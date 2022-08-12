import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int lastIndexM2(int arr[],int x){
        int n=arr.length;
        
        int ans=-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        
        return ans;
    }
    
    public static int lastIndexM1(int arr[],int x){
        int n=arr.length;
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                return i;
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
        
        // int ans1=lastIndexM1(arr,x);
        // System.out.println(ans1);
        
        int ans2=lastIndexM2(arr,x);
        System.out.println(ans2);
    }
}
