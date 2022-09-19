import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkSameRowAfter(char arr[][],String str,int row,int col){
        int n=arr.length;
        col+=1;
        
        for(int k=1;k<str.length();k++){
            if(col>=n){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            
            col++;
        }
        
        return true;
        
    }
    
    public static boolean checkSameRowBefore(char arr[][],String str,int row,int col){
        int n=arr.length;
        col-=1;
        
        for(int k=1;k<str.length();k++){
            if(col<0){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            
            col--;
        }
        
        return true;
        
    }
    
    public static boolean checkSameColAfter(char arr[][],String str,int row,int col){
        int n=arr.length;
        row+=1;
        
        for(int k=1;k<str.length();k++){
            if(row>=n){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            
            row++;
        }
        
        return true;
        
    }
    
    public static boolean checkSameColBefore(char arr[][],String str,int row,int col){
        int n=arr.length;
        row-=1;
        
        for(int k=1;k<str.length();k++){
            if(row<0){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            
            row--;
        }
        
        return true;
        
    }
    
    public static boolean checkRightDiagonalAbove(char arr[][],String str,int row,int col){
        int n=arr.length;
        col+=1;
        row-=1;
        
        for(int k=1;k<str.length();k++){
            if(row<0 || col>=n){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            row--;
            col++;
        }
        
        return true;
        
    }
    
    
    public static boolean checkRightDiagonalBelow(char arr[][],String str,int row,int col){
        int n=arr.length;
        col-=1;
        row+=1;
        
        for(int k=1;k<str.length();k++){
            if(row>=n || col<0){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            row++;
            col--;
        }
        
        return true;
        
    }
    
    
    public static boolean checkLeftDiagonalAbove(char arr[][],String str,int row,int col){
        int n=arr.length;
        col-=1;
        row-=1;
        
        for(int k=1;k<str.length();k++){
            if(row<0 || col<0){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            row--;
            col--;
        }
        
        return true;
        
    }
    
    
    public static boolean checkLeftDiagonalBelow(char arr[][],String str,int row,int col){
        int n=arr.length;
        col+=1;
        row+=1;
        
        for(int k=1;k<str.length();k++){
            if(row>=n || col>=n){
                return false;
            }else if(str.charAt(k)!=arr[row][col]){
                return false;
            }
            row++;
            col++;
        }
        
        return true;
        
    }
    
    public static boolean checkAllDirections(char arr[][],String str,int row,int col){
        
        boolean ans1=checkSameRowAfter(arr,str,row,col);
        boolean ans2=checkSameRowBefore(arr,str,row,col);
        boolean ans3=checkSameColAfter(arr,str,row,col);
        boolean ans4=checkSameColBefore(arr,str,row,col);
        boolean ans5=checkRightDiagonalAbove(arr,str,row,col);
        boolean ans6=checkRightDiagonalBelow(arr,str,row,col);
        boolean ans7=checkLeftDiagonalAbove(arr,str,row,col);
        boolean ans8=checkLeftDiagonalBelow(arr,str,row,col);
        
        if(ans1==true || ans2==true||ans3==true || ans4==true||ans5==true || ans6==true||ans7==true || ans8==true){
            return true;
        }
        
        return false;
        
        
    }
    
    
    public static boolean crossWord(char arr[][],String str){
        int n=arr.length;
        char ch=str.charAt(0);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==ch){
                    boolean ans=checkAllDirections(arr,str,i,j);
                    if(ans==true){
                        return true;
                    }
                }
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        char arr[][]=new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.next().charAt(0);
            }
        }
        
        String str=scn.next();
        
        boolean ans=crossWord(arr,str);
        System.out.println(ans);
    }
}
