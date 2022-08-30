import java.io.*;
import java.util.*;

public class Solution {
    public static void displayArr(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void addOne(int arr[]){
        int n=arr.length;
        
        int carry=1;
        
        for(int i=n-1;i>=0;i--){
            int num=arr[i]+carry;
            
            if(num==10){
                arr[i]=0;
                carry=1;
            }else {
                arr[i]=num;
                carry=0;
            }
        }
        
        if(carry>0){
            System.out.print(carry+" ");
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
        
        addOne(arr);
        displayArr(arr);
    }
}
