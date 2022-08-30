import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        replaceValue(arr);
    }
    
    public static void replaceValue(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr[i]+=1;
            }else if(arr[i]<0){
                arr[i]+=3;
            }else {
                arr[i]+=2;
            }
        }
        
        displayArr(arr);
    }
    
    public static void displayArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
