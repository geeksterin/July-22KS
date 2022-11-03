import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int num=scn.nextInt();
            min=Math.min(min,num);
            max=Math.max(max,num);
            
            map.put(num,map.getOrDefault(num,0)+1);
           
            
        }
        int key=min;
        
       while(key<=max){
           if(map.containsKey(key)==true){
               if(Math.abs(key)==map.get(key)){
                   System.out.println(key);
               }
           } 
           key++;
       }
    }
}
