import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printOddEven(int arr[]){
        int n=arr.length;
        
//         Odd Numbers
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        
        System.out.println();
//         Even Numbers
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
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
        
        printOddEven(arr);
    }
}
