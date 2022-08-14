import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkComposite(int x){
        int count=0;
        
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        
        
        if(count>2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]!=1 && checkComposite(arr[i])==true){
                System.out.println(arr[i]);
            }
        }
    }
}
