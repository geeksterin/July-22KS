import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int maxElement(int arr[]){
        int n=arr.length;
        
        int max_count=0;
        int max_element=0;
        
        int count=0;
        for(int i=0;i<n;i++){
            // int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            
            if(count>max_count){
                max_count=count;
                max_element=arr[i];
            }
            count=0;
        }
        
        return max_element;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=maxElement(arr);
        System.out.println(ans);
    }
}
