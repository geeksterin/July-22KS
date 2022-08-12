import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        
        if(count==2) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        
        for(int i=2;i<=n;i++){
            int num=i;
            
            boolean ans=checkPrime(num);
            
            if(ans==true){
                
                System.out.print(num+" ");
            }
        }
    }
}
