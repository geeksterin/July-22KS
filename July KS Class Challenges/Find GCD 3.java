import java.io.*;
import java.util.*;

public class Solution {
    
    public static int gcd(int x,int y){
        
        int min=0;
        if(x>y){
            min=y;
        }else {
            min=x;
        }
        
        int ans=0;
        
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0){
                ans=i;
                break;
            }
        }
        
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        int ans=gcd(x,y);
        
        System.out.println(ans);
    }
}
