import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int age=scn.nextInt();
        
        if(age>=18){
            System.out.println("Adult");
        }else {
            System.out.println("Below age");
        }
    }
}
