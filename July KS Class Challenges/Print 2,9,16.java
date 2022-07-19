import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
//         for(int i=2;i<=n;i+=7){
//             System.out.println(i);
//         }
        
        int i=2;
        while(i<=n){
            System.out.println(i);
            i+=7;
        }
    }
}
