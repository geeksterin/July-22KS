import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int a=0;
        int b=1;
        int c=1;
        
        for(int i=1;i<=n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        
        System.out.println(a);
    }
}
