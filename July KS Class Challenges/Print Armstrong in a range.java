import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printArmstrong(int x,int y){
        
        for(int i=x;i<=y;i++){
            int num=i;
            
            int ans=0;
            while(num>0){
                int ld=num%10;
                ans+=(ld*ld*ld);
                num/=10;
            }
            
            if(ans==i){
                System.out.println(ans);
            }
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        printArmstrong(x,y);
    }
}
