import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void interChangeRows(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        
        
        int fr=0;
        int lr=m-1;
        
        for(int j=0;j<n;j++){
            int temp=arr[fr][j];
            arr[fr][j]=arr[lr][j];
            arr[lr][j]=temp;
        }
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        
        int arr[][]=new int [m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        interChangeRows(arr);
    }
}
