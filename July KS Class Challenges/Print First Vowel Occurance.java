import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        
        return false;
    }
    
    public static int findVowel(char arr[]){
        
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            char ch=arr[i];
            
            if(checkVowel(ch)==true){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        char arr[]=new char[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        
        int ans=findVowel(arr);
        
        System.out.println(ans);
    }
}
