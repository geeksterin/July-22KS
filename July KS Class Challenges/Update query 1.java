import java.io.*;
import java.util.*;

public class Solution {

    public static void displayArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void leftRightUpdate(int arr[],int left,int right,int x){
        
        
        for(int i=left;i<=right;i++){
            arr[i]=x;
        }
        
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int left=scn.nextInt();
        int right=scn.nextInt();
        
        int x=scn.nextInt();
        
        leftRightUpdate(arr,left,right,x);
        displayArr(arr);
    }
}
