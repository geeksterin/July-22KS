import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void reversePairPrint(int arr[]){
        int n=arr.length;
        
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        reversePairPrint(arr);
    }
}
