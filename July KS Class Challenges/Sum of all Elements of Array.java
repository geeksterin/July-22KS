import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int arraySum(int arr[]){
        
        int n=arr.length;
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=arraySum(arr);
        System.out.println(ans);
    }
}
