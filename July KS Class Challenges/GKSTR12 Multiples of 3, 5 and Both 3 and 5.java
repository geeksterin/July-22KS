import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
//         for(int i=3;i<=n;i++){
//             if(i%3==0 || i%5==0){
//                 System.out.print(i+"\t");
//             }
//         }
        
        int i=1;
        
        while(i<=n){
            if(i%3==0 || i%5==0){
                System.out.print(i+"\t");
                
            }
            i++;
        }
    }
}
