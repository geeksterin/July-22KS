import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        char ch=scn.nextLine().charAt(0);
        
        if(ch=='M' || ch=='m'){
           System.out.println("You are a male"); 
        }else if(ch=='F' || ch=='f'){
            System.out.println("You are a female");
        }else {
            System.out.println("Type again");
        }
        
    }
}
