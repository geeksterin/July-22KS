import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int max=-100;
        int steps=0;
        for(int i=0;i<n;i++){
            int x=scn.nextInt();
            if(x>max){
                max=x;
                steps++;
            }
            
        }
        System.out.println(steps);
    }
}
