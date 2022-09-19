import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void reverseByRow(int arr[][],int row){
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
    
    public static void interChangeByRow(int arr[][]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            reverseByRow(arr,i);
        }
    }
    public static void reverseByCol(int arr[][],int col){
        int n=arr.length;
        
        int left=0;
        int right=n-1;
        
        while(left<right){
            int temp=arr[left][col];
            arr[left][col]=arr[right][col];
            arr[right][col]=temp;
            
            left++;
            right--;
        }
    }
    
    public static void interChangeByCol(int arr[][]){
        int n=arr.length;
        
        for(int j=0;j<n;j++){
            reverseByCol(arr,j);
        }
    }

    public static void display(int arr[][]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
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
        
        interChangeByRow(arr);
        interChangeByCol(arr);
        display(arr);
    }
}
