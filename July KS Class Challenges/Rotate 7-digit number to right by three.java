import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int temp=n;
        int count=0;
        
        while(temp>0){
            count++;
            temp/=10;
        }
        
        int reverseNumber=0;
        int op=3;
        count-=3;
        int num=1;
        while(count>0){
            num*=10;
            count--;
        }
        
        
        
        while(op>0){
            int lastdigit=n%10;
            reverseNumber=reverseNumber*10+lastdigit;
            op--;
            n/=10;
        }
        
        int rn=0;
        while(reverseNumber>0){
            int k=reverseNumber%10;
            rn=rn*10+k;
            reverseNumber/=10;
        }
        
    
        
        
        rn*=num;
        
        rn+=n;
        
        System.out.println(rn);
        
    }
}
