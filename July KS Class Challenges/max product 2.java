import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        // PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(max2<arr[i]){
                max2=arr[i];
            }
        }
        
        System.out.println((max1-1)*(max2-1));
    }
}
