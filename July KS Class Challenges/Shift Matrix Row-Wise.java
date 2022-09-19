import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void reverse(int arr[][],int row,int left,int right ){
        
        while(left<right){
            int temp=arr[row][left];
            arr[row][left]=arr[row][right];
            arr[row][right]=temp;
        }
        
    }
    
    public static void shiftRows(int arr[][],int k){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            reverse(arr,i,0,n-1);
            reverse(arr,i,0,k-2);
            reverse(arr,i,k-1,n-1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int k=scn.nextInt();
        
        shiftRows(arr,k);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            
            System.out.println();
        }
    }
}
