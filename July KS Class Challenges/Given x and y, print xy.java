import java.io.*;
import java.util.*;

public class Solution {

    public static int formNumber(int x,int y){
        int ans=x*10+y;
        
        return ans;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        int ans=formNumber(x,y);
        
        System.out.println(ans);
    }
}
