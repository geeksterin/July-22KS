import java.io.*;
import java.util.*;

public class Solution {
    public static void printOddValues(int arr[]){
        
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            // Check for odd values
            if(arr[i]%2!=0){
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
        
        printOddValues(arr);
    }
}
