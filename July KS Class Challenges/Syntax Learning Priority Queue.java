import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int t=scn.nextInt();
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=1;i<=t;i++){
            int c=scn.nextInt();
            
            if(c==1){
                System.out.println(pq.size());
                
            }else if(c==2){
                if(pq.size()==0){
                    System.out.println(-1);
                }else {
                    pq.remove();
                }
                
                
            }else if(c==3){
                int x=scn.nextInt();
                pq.add(x);
                
            }else if(c==4){
                if(pq.size()==0){
                    System.out.println(-1);
                }else {
                    System.out.println(pq.peek());
                }
                
            }
        }
    }
}