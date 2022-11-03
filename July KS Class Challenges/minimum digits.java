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
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        long n1=0;
        long n2=0;
        
        boolean flag=true;
//         true -> n1, false-> n2
        while(pq.size()>0){
            
            if(flag==true){
                n1=n1*10+pq.remove();
                flag=false;
            }else {
                n2=n2*10+pq.remove();
                flag=true;
            }
            
        }
        
        System.out.println(n1+n2);
        
       
    }
}
