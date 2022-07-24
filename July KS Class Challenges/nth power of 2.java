import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int ans=1;
        
//         for(int i=1;i<=n;i++){
//             ans*=2;  // ans=ans*2;
//         }
        
        int i=1;
        
        while(i<=n){
            ans*=2;
            i++;
        }
        
        System.out.println(ans);
    }
}
