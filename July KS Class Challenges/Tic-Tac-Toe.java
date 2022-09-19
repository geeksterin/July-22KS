import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkRightDiagonal(int arr[][],int row,int col){
        int n=arr.length;
        
        int count=0;
        for(int i=row,j=col;i<n && j>=0;j--,i++){
            if(arr[i][j]==0){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        
         count=0;
        for(int i=row,j=col;i<n && j>=0;j--,i++){
            if(arr[i][j]==1){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        return false;
    }
    
    
    public static boolean checkLeftDiagonal(int arr[][],int row,int col){
        int n=arr.length;
        
        int count=0;
        for(int i=row,j=col;i<n && j<n;j++,i++){
            if(arr[i][j]==0){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        
         count=0;
        for(int i=row,j=col;i<n && j<n;j++,i++){
            if(arr[i][j]==1){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        return false;
    }
    
    
    public static boolean checkCol(int arr[][],int col){
        int n=arr.length;
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i][col]==0){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        count=0;
        
        for(int i=0;i<n;i++){
            if(arr[i][col]==1){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        return false;
    }
    
    public static boolean checkRow(int arr[][],int row){
        int n=arr.length;
        
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[row][j]==0){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        count=0;
        for(int j=0;j<n;j++){
            if(arr[row][j]==1){
                count++;
            }
        }
        
        if(count==n){
            return true;
        }
        
        return false;
    }
    
    public static String ticTacToe(int arr[][]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean ans1=checkRow(arr,i);
                boolean ans2=checkCol(arr,j);
                boolean ans3=checkLeftDiagonal(arr,i,j);
                boolean ans4=checkRightDiagonal(arr,i,j);
                
                if(ans1==true || ans2==true || ans3==true || ans4==true ){
                    return "Games End";
                }
            }
        }
        
        return "Draw";
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
        
        String ans=ticTacToe(arr);
        System.out.println(ans);
    }
}
