import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void reachTarget(int arr[],int tar){
        int left=0;
        int right=arr.length-1;
        
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==tar){
                System.out.println(left+" "+right);
                left++;
                right--;
            }else if(tar>sum){
                left++;
            }else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int tar=scn.nextInt();
        Arrays.sort(arr);
        
        reachTarget(arr,tar);
    }
}
