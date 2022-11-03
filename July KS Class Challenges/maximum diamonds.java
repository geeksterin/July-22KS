import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        int profit=0;
        while(k>0){
            int value=pq.remove();
            profit+=value;
            pq.add(value/2);
            k--;
        }
        
        System.out.println(profit);
    }
}
