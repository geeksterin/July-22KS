import java.io.*;
import java.util.*;

public class Solution {
    
    public static int substractNumber(int arr[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                pq.add(arr[i]);
            }
        }
        
        int ans=0;
        while(pq.size()>0){
            int x=pq.remove();
            ans++;
            
            for(int i=0;i<n;i++){
                if(arr[i]!=0) arr[i]-=x;
            }
            
            int count=0;
            
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    count++;
                }
            }
            
            if(count==n){
                break;
            }
            
            pq.clear();
            
            // pq=new PriorityQueue<>();
            
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    pq.add(arr[i]);
                }
            }
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=substractNumber(arr);
        System.out.println(ans);
    }
}
