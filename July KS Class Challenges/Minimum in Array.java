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
        
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();

        }
        
        int min=arr[0];
        for(int i=1;i<n;i++){
            
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        
        System.out.println(min);
        
    }
}
