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
    
    public static void waveSort(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            swap(arr,i,i+1);
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
        
        waveSort(arr);
        
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
