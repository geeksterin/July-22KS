import java.io.*;
import java.util.*;

public class Solution {

    public static boolean uniqueOccurences(int arr[], HashMap<Integer,Integer>map){
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        HashMap<Integer,Boolean>map2=new HashMap<>();
        
        for(Integer key:map.keySet()){
            
            int value=map.get(key);
            
            if(map2.containsKey(value)==true){
                return false;
            }else {
                map2.put(value,true);
            }
        }
        
        return true;
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        boolean ans=uniqueOccurences(arr,map);
        
        System.out.println(ans);
    }
}
