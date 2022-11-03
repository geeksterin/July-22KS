import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        
        int ans=0;
        int odd=0;
        
        
        for(Character ch:map.keySet()){
            
            int frequency=map.get(ch);
            
            if(frequency%2==0){
                ans+=frequency;
            }else {
                
                odd=1;
                ans+=(frequency-1);
            }
        }
        
        
        System.out.println(ans+odd);
    }
}
