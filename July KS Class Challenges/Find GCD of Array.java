import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int findGCD(int x,int y){
        
        int min=Math.min(x,y);
        
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        
        return 1;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int gcd=findGCD(arr[0],arr[1]);
        
        for(int i=2;i<arr.length;i++){
            gcd=findGCD(gcd,arr[i]);
        }
        
        System.out.println(gcd);
    }
}
