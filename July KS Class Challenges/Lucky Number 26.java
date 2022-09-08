import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void luckyInteger(int arr[]){
        int freq[]=new int[10];
        int ans=-1;
        
        for(int i=0;i<arr.length;i++){
            int index=arr[i];
            freq[index]++;
        }
        
        
        for(int i=1;i<10;i++){
            if(freq[i]==i){
                ans=i;
            }
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        luckyInteger(arr);
    }
}
