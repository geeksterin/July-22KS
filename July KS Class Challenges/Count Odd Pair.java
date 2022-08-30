import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        countOddPairs(arr);
    }
    
    public static void countOddPairs(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=arr[i]+arr[j];
                
                if(sum%2!=0){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
