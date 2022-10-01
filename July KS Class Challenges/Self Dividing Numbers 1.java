import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkNumberDivisible(int n){
        
        int num=n;
        
        while(num>0){
            int rem=num%10;
            
            if(n%rem!=0){
                return false;
            }
            
            num/=10;
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int left=scn.nextInt();
        int right=scn.nextInt();
        
        for(int i=left;i<=right;i++){
            boolean ans=checkNumberDivisible(i);
            if(ans==true){
                System.out.println(i);
            }
        }
    }
}
