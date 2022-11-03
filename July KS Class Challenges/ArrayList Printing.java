import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 // 12 21 23 45 43
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        ArrayList<Integer>arr=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            // al[i]=scn.nextInt()
            int x=scn.nextInt();
            
            arr.add(x);
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(Integer x:arr){
            System.out.print(x+" ");
        }
        
    }
}
