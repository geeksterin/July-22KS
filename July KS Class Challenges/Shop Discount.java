import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int b=scn.nextInt();
        int price=b*100;
        if(price>1000){
            int discount=(price*10)/100;
            price=price-discount;
        }
        
        System.out.println(price);
        
    }
}
