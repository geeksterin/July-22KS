import java.io.*;
import java.util.*;

public class Solution {
  
  public static void swap_xyz(int x,int y,int z){
        
        int temp=x;
        x=z;
        z=y;
        y=temp;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
  }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();
      
      swap_xyz(x,y,z);
        
    }
}
