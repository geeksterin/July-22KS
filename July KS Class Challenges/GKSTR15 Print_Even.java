import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
