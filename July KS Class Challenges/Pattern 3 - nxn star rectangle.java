import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
