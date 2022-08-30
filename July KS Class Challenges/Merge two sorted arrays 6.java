import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int [] mergeTwoSortedArrays(int a1[],int a2[]){
        
        int n=a1.length;
        int m=a2.length;
        int a[]=new int[n+m];
        
        
        int i=0,j=0,k=0;
        
        while(i<n && j<m){
            if(a1[i]<a2[j]){
                a[k]=a1[i];
                i++;
                k++;
            }else {
                a[k]=a2[j];
                j++;
                k++;
            }
        }
        
        while(i<n){
            a[k]=a1[i];
            i++;
            k++;
        }
        
        while(j<m){
            a[k]=a2[j];
            j++;
            k++;
        }
        
        return a;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int a1[]=new int[n];
        
        for(int i=0;i<n;i++){
            a1[i]=scn.nextInt();
        }
        
        int m=scn.nextInt();
        
        int a2[]=new int [m];
        
        for(int i=0;i<m;i++){
            a2[i]=scn.nextInt();
        }
        
        int ans[]=mergeTwoSortedArrays(a1,a2);
        
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
