import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void swap(int arr[],int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        
        for(int itr=1;itr<=n-1;itr++){
            for(int j=0;j<n-itr;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        bubbleSort(arr);
        
        int ans=Math.max(arr[0]*arr[1]*arr[n-1],arr[n-1]*arr[n-2]*arr[n-3]);
        System.out.println(ans);
    }
}
