import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        
        if(str.length()>=4){
            char ch=str.charAt(3);
            System.out.println(ch);
        }else {
            System.out.println("Small string");
        }
    }
}
