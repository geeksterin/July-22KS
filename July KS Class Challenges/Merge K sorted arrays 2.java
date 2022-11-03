import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0;i<k;i++){
            int n=scn.nextInt();
            int arr[]=new int[n];
            
            for(int j=0;j<n;j++){
                arr[j]=scn.nextInt();
                pq.add(arr[j]);
            }
        }
        
        int ans[]=new int[pq.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.remove();
        }
        
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
