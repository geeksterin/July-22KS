import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 for(int j=1;j<=n;j++){
//                     System.out.print("*\t");
//                 }
//             }else {
//                 System.out.print("*\t");
//                 for(int j=1;j<=n-2;j++){
//                     System.out.print("\t");
//                 }
//                 System.out.print("*");
                
//             }
            
//         System.out.println();
//         }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i%2!=0) || (j==1) || j==n){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }
        
    }
}
