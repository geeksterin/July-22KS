import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void spiralMatrix(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        
        int rmin=0;
        int cmin=0;
        int rmax=m-1;
        int cmax=n-1;
        int counter=0;
        
        while(counter<m*n){
            //         upper horizontal
            for(int j=cmin;j<=cmax && counter<m*n;j++){
                System.out.print(arr[rmin][j]+"   ");
                counter++;
            }

            rmin++;
    //         back vertical
            for(int i=rmin;i<=rmax && counter<m*n;i++){
                System.out.print(arr[i][cmax]+"   ");
                counter++;
            }

            cmax--;
    //         bottom horizontal
            for(int j=cmax;j>=cmin && counter<m*n;j--){
                System.out.print(arr[rmax][j]+"   ");
                counter++;
            }

            rmax--;
    //         front vertical
            for(int i=rmax;i>=rmin && counter<m*n;i--){
                System.out.print(arr[i][cmin]+"   ");
                counter++;
            }
            cmin++;
            
        }
        
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int m=scn.nextInt();
        int n=scn.nextInt();
        
        int arr[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        spiralMatrix(arr);
    }
}
