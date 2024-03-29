import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        
        int arr[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            pq.add(count*100+i);
        }
        
        for(int i=0;i<k;i++){
            System.out.print(pq.remove()%100+" ");
        }
    }
}
