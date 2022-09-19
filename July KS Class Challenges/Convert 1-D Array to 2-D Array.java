import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void convert1Dto2D(int arr[],int p,int q){
        
        int result[][]=new int[p][q];
        int count=0;
        
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                result[i][j]=arr[count];
                count++;
            }
        }
        
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
               System.out.print(result[i][j]+" ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int p=scn.nextInt();
        int q=scn.nextInt();
        
        convert1Dto2D(arr,p,q);
    }
}
