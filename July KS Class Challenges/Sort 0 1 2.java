import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void sort012(int arr[]){
        int n=arr.length;
        int i=0,j=0,k=n-1;
        
        while(i<=k){
            if(arr[i]==1){
                i++;
            }else if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else {
                swap(arr,i,k);
                k--;
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
        
        sort012(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
