import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int experience =scn.nextInt();
        int salary=scn.nextInt();
        int rank=scn.nextInt();
        
        if(experience >=10 || salary>=50000 || rank>=10){
            System.out.println("You are in top management");
        }else {
            System.out.println("You are not in top management");
        }
        
    }
}
