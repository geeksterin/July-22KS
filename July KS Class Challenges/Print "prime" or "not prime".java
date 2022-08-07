import java.io.*;
import java.util.*;

public class Solution {
    
    public static void prime(int x){
        
        int count=0;
        
        for(int i=1;i<=x;i++){
            if(x%i==0) count++;
        }
        
        if(count==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        for(int i=1;i<=n;i++){
            int x=scn.nextInt();
            prime(x);
        }
    }
}
