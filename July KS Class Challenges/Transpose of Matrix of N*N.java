import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void swap(int A[][],int i,int j){
        int temp=A[i][j];
        A[i][j]=A[j][i];
        A[j][i]=temp;
    }
    
    public static void transpose(int A[][]){
        int n=A.length;
    
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                swap(A,i,j);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int A[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=scn.nextInt();
            }
        }
        
        transpose(A);
    }
}
