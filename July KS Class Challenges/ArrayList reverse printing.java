import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        ArrayList<Integer>arr=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int x=scn.nextInt();
            arr.add(x);
        }
        
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
            al.add(arr.get(i));
        }
        
        System.out.println();
        
        for(Integer x:al){
            System.out.print(x+" ");
        }     
    }
}
