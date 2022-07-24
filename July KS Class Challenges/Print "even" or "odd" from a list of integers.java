import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
//         for(int i=1;i<=n;i++){
//             int x=scn.nextInt();
            
//             if(x%2==0){
//                 System.out.println("even");
//             }else {
//                 System.out.println("odd");
//             }
//         }
        
        int i=1;
        while(i<=n){
            int x=scn.nextInt();
            if(x%2==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
            
            i++;
        }
        
    }
}
