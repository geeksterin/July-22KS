import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char ch1='a';
        char ch2='C';
        // int i=1;
        // while(ch1<='z' || ch2<='Z'){
        //     if(i%2!=0){
        //         System.out.println(ch1);
        //         ch1+=4;
        //     }else {
        //         System.out.println(ch2);
        //         ch2+=4;
        //     }
        //     i++;
        // }
        
        for(int i=1;ch1<='z' || ch2<='Z';i++){
            if(i%2!=0){
                System.out.println(ch1);
                ch1+=4;
                
            }else {
                System.out.println(ch2);
                ch2+=4;
            }
        }
        
    }
}
