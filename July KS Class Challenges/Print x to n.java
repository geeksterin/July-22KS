import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int n=scn.nextInt();
        
        int i=x;
        
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
