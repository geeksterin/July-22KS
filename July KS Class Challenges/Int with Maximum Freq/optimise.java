import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void maxFreq(int arr[]){
        int n=arr.length;
        int maxCount=0;
        int ans=0;
        int count=1;
        int i=1;
        
        while(i<n){
            if(arr[i]==arr[i-1]){
                count++;
            }else {
                if(maxCount<count){
                    maxCount=count;
                    ans=arr[i-1];
                }
                count=1;
            }
            i++;
        }
        
        if(maxCount<count){
            ans=arr[i-1];
        }
        
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        maxFreq(arr);
        
        }
}
