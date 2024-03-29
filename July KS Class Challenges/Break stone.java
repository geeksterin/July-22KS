import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        while(pq.size()>=2){
            int y=pq.remove();
            int x=pq.remove();
            
            if(y!=x){
                pq.add(y-x);
            }
        }
        
        if(pq.size()>0){
            System.out.println(pq.peek());
        }else {
            System.out.println(0);
        }
    }
}
