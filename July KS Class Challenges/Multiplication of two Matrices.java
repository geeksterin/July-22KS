import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void matrixMultiplication(int arr1[][],int arr2[][]){
        
        int m1=arr1.length;
        int n1=arr1[0].length;
        
        int m2=arr2.length;
        int n2=arr2[0].length;
        
        
        int arr3[][]=new int [m1][n2];
        
        
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n1;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        int m1=scn.nextInt();
        int n1=scn.nextInt();
        
        int arr1[][]=new int[m1][n1];
        
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        
        int m2=scn.nextInt();
        int n2=scn.nextInt();
        
        int arr2[][]=new int[m2][n2];
        
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        
        
        if(n1!=m2){
            System.out.println(-1);
            return ;
        }
        
        
        matrixMultiplication(arr1,arr2);
        
    }
}
