import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static void swap(int arr[][],int row,int left,int right){
        
        int temp=arr[row][left];
        arr[row][left]=arr[row][right];
        arr[row][right]=temp;
        
    }
    
    public static void reverse(int arr[][],int row){
        
        int left=0;
        int right=arr.length-1;
        
        while(left<right){
            swap(arr,row,left,right);
            left++;
            right--;
        }
        
    }
    
    public static void reverseRow(int arr[][]){
        int n=arr.length;
        
        
        for(int i=0;i<n;i++){
            reverse(arr,i);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        reverseRow(arr);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
