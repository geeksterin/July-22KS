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
                String phoneNumber=scn.next();
                String name=scn.next();
                
                map.put(phoneNumber,name);
            }else if(n==2){
                String phoneNumber=scn.next();
                
                System.out.println(map.getOrDefault(phoneNumber,"-1"));
            }else if(n==3){
                String phoneNumber=scn.next();
                
                map.remove(phoneNumber);
            }else {
                break;
            }
        }
    }
}
