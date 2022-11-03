import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        HashMap<String,String>map=new HashMap<>();
        
        while(true){
            int n=scn.nextInt();
            
            if(n==1){
                String name=scn.next();
                String phoneNumber=scn.next();
                
                map.put(name,phoneNumber);
            }else if(n==2){
                String name=scn.next();
                
                System.out.println(map.getOrDefault(name,"-1"));
            }else if(n==3){
                String name=scn.next();
                
                map.remove(name);
            }else {
                break;
            }
        }
    }
}
