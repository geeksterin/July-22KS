import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int q[]=new int[100000];
        
        int rear=0,front=0;
        
        int n=scn.nextInt();
        
        for(int i=1;i<=n;i++){
            String str=scn.next();
            
            if(str.equals("enqueue")){
                int x=scn.nextInt();
                q[rear]=x;
                rear++;
            }
            else if(str.equals("display")){
                for(int j=front;j<rear;j++){
                    System.out.print(q[j]+" ");
                }
                System.out.println();
            }
            
            else if(str.equals("dequeue")){
                if(front!=rear)
                    front++;
            }
            
            else if(str.equals("size")){
                System.out.println(rear-front);
            }
        }
        
    }
}
