import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void maxFreq(int arr[]){
        
        int n=arr.length;
        int freq[]=new int[10];
        
        for(int i=0;i<n;i++){
            int index=arr[i];
            freq[index]++;
        }
        
        int maxCount=0;
        int ans=0;
        
        
        for(int i=0;i<10;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                ans=i;
            }
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
