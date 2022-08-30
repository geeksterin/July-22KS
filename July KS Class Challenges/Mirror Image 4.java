import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void findAdditiveInverse(int a1[],int a2[]){
        
        int n=a1.length;
        int m=a2.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a1[i]+a2[j]==0){
                    System.out.print(a1[i]+" ");
                    break;
                }
            }
        }
        
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
        
        int a2[]=new int[m];
        
        for(int i=0;i<m;i++){
            a2[i]=scn.nextInt();
        }
        
        findAdditiveInverse(a1,a2);
    }
}
