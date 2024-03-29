import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int A[]=new int[n];
        
        for(int i=0;i<n;i++){
            A[i]=scn.nextInt();
        }
        
        int m=scn.nextInt();
        
        int B[]=new int[m];
        
        for(int i=0;i<m;i++){
            B[i]=scn.nextInt();
        }
        
        ArrayList<Integer>al=new ArrayList<>();
        
        int i=0,j=0;
        
        if(A[i]>B[j]){
            al.add(B[j]);
            j++;
        }else {
            al.add(A[i]);
            i++;
        }
        
        while(i<n && j<m){
            if(A[i]>B[j]){
                if(al.get(al.size()-1)!=B[j]){
                    al.add(B[j]);
                }
                j++;
            }else{
                if(al.get(al.size()-1)!=A[i]){
                    al.add(A[i]);
                
                }
                i++;
            }
        }
        
        
        while(i<n){
            if(al.get(al.size()-1)!=A[i]){
                al.add(A[i]);
            }
            i++;
        }
        
        while(j<m){
            if(al.get(al.size()-1)!=B[j]){
                al.add(B[j]);
                
            }
            j++;
        }
        
        for( Integer x:al){
            System.out.print(x+" ");
        }
        
    }
}
