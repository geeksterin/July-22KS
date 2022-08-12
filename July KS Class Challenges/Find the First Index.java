import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int firstIndex(int arr[],int x){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
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
        
        int ans=firstIndex(arr,x);
        System.out.println(ans);
    }
}
