import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int binarySearch(char arr[],char c){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(arr[mid]==c){
                return mid;
            }
            else if(arr[mid]>c){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        char ch=scn.next().charAt(0);
        
        int n=scn.nextInt();
        char arr[]=new char[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        
        ch++;
        for(char c=ch;c<='z';c++){
            int ans=binarySearch(arr,c);
            if(ans!=-1){
                System.out.println(c);
                return ;
            }
        }
        
        System.out.println(-1);
        
        
    }
}
