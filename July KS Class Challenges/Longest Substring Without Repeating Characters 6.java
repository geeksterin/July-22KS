import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        int i=-1,j=-1,ans=0;
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        while(true){
            
            boolean flag1=false;
            boolean flag2=false;
            
//             acquire
            while(i<str.length()-1){
                i++;
                flag1=true;
                
                char ch=str.charAt(i);
                
                map.put(ch,map.getOrDefault(ch,0)+1);
                
                
                if(map.get(ch)==2){
                    break;
                }else {
                    int len=i-j;
                    if(len>ans){
                        ans=len;
                    }
                }
                
                
            }
            
//             release
            while(j<i){
                j++;
                flag2=true;
                
                char ch=str.charAt(j);
                
                map.put(ch,map.get(ch)-1);
                
                if(map.get(ch)==1){
                    break;
                }
            }
            
            if(flag1==false && flag2==false){
                break;
            }
            
        }
        
        System.out.println(ans);
    }
}
