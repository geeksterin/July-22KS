import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int marks=scn.nextInt();
        
        if(marks>90){
            System.out.println("excellent");
        }else if(marks>80 && marks<=90){
            System.out.println("good");
        }else if(marks>70 && marks<=80){
            System.out.println("fair");
        }else if(marks>60 && marks<=70){
            System.out.println("meets expectations");
        }else if(marks>40 && marks<=60){
            System.out.println("below par");
        }else {
            System.out.println("failed");
        }
        
    }
}
