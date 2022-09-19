import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void transpose(int arr[][]){
        
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public static void reverse(int arr[][],int row){
        int n=arr.length;
        
        int left=0;
        int right=n-1;
        
        while(left<right){
            int temp=arr[row][left];
            arr[row][left]=arr[row][right];
            arr[row][right]=temp;
            
            left++;
            right--;
        }
    }
    
    public static void interchangeRowValues(int arr[][]){
        
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            reverse(arr,i);
        }
    }
    
    public static void display(int arr[][]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            
            System.out.println();
        }
    }
    
    public static void rotateBy90(int arr[][]){
        
        transpose(arr);
        interchangeRowValues(arr);
        display(arr);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        
        int arr[][]=new int [n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        rotateBy90(arr);
    }
}
