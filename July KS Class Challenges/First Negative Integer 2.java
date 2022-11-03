import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        int arr[]=new int[n];
        
        Queue<Integer>q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        
        
        for(int i=k;i<n;i++){
            if(q.size()>0){
                System.out.print(arr[q.peek()]+" ");
            }else {
                System.out.print(0+" ");
            }
            
            while(q.size()>0 && q.peek()<(i-k+1)){
                q.remove();
            }
            
            if(arr[i]<0){
                q.add(i);
            }
        }
        
        if(q.size()>0){
            System.out.print(arr[q.peek()]);
        }else {
            System.out.print(0);
        }
    }
}
