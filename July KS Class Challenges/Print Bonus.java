import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int salary=scn.nextInt();
        int years=scn.nextInt();
        
        if(years>5){
            int bonus=(salary*5)/100;
            System.out.println(bonus);
        }else{
            System.out.println(0);
        }
    }
}
