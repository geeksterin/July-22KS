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
        
        insertionSort(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void swap(int arr[],int j,int i){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void insertionSort(int arr[]){
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j+1]<arr[j]){
                    swap(arr,j,j+1);
                }else {
                    break;
                }
            }
        }
    }
}
