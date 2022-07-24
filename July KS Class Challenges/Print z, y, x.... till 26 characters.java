import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // for(char i='z';i>='a';i--){
        //     System.out.println(i);
        // }
        
        char i='c';
        // i+=26;
        int count=26;
        // System.out.println(i);
        
        while(count>0){
            System.out.println(i);
            i+=1;
            count--;
        }
    }
}
