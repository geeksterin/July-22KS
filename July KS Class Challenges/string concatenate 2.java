import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String a=scn.next();
        String b=scn.next();
        
        if(a.length()>b.length()){
            System.out.println(b+a+b);
        }else {
            System.out.println(a+b+a);
        }
    }
}
