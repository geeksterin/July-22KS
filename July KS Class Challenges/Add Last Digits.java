import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        int lastDigitofX=x%10;
        int lastDigitofy=y%10;
        
        int sum=lastDigitofX+lastDigitofy;
        
        System.out.println(sum);
        
    }
}
