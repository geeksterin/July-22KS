import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void swap(int lucky[],int vinod,int lakshay){
        int temp=lucky[vinod];
        lucky[vinod]=lucky[lakshay];
        lucky[lakshay]=temp;
    }
    
    public static void sortArray(int arr[]){
        int n=arr.length;
        
        for(int itr=1;itr<=n-1;itr++){
            for(int j=0;j<n-itr;j++){
                if(arr[j]*arr[j]>arr[j+1]*arr[j+1]){
                    swap(arr,j,j+1);
                }
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
        
        sortArray(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
