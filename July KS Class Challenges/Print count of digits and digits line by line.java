import java.io.*;
import java.util.*;

public class Solution {
    public static int countDigit(int n){
        int count=0;
        
        while(n>0){
            count++;
            n/=10;
        }
        
        return count;
    }
    
    public static void printDigit(int n){
        while(n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int ans=countDigit(n);
        System.out.println(ans);
        
        printDigit(n);
    }
}
