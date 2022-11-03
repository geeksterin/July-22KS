import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean containsDuplicate(int arr[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(Integer key:map.keySet()){
            if(map.get(key)>1){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        boolean ans=containsDuplicate(arr);
        
        System.out.println(ans);
    }
}
