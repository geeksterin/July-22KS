import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        
        if(a>b && a>c){ // implies A is oldest
            System.out.println("A");
        }else if(b>c){ // check for b and c and also implies a is not oldest
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }
}
