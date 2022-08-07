import java.io.*;
import java.util.*;

public class Solution {

    public static void printDigits(int n){
        
        while(n>0){
            int lastDigit=n%10;
            System.out.println(lastDigit);
            
            n/=10;
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        printDigits(n);
    }
}
