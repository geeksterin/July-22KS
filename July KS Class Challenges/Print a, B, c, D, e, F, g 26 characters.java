import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char ch1='a';
        char ch2='B';
        
        for(int i=1;i<=26;i++){
            if(i%2==0){
                System.out.println(ch2);
                ch2+=2;
            }else {
                System.out.println(ch1);
                ch1+=2;
            }
        }
    }
}
