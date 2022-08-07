import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkArmstrong(int n){
        
        int ans=0;
        
        for(int i=n;i>0;i/=10){
            int ld=i%10;
            ans=ans+(ld*ld*ld);
        }
        
        if(n==ans){
            return true;
        }else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        
        boolean ans=checkArmstrong(n);
        
        System.out.println(ans);
    }
}
