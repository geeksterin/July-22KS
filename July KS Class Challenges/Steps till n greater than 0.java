import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int steps=0;
        
        // int i=n;
        
        // while(i>0){
        //     if(i%2==0){
        //         i-=1;
        //     }else {
        //         i-=3;
        //     }
        //     steps++;
        // }
        
        for(int i=n;i>0;){
            if(i%2==0){
                i-=1;
            }else {
                i-=3;
            }
            
            steps++;
        }
        
        
        
        System.out.println(steps);
    }
}
