import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        double fah=scn.nextDouble();
        double ans=((fah-32)*5)/9;
        System.out.println(ans);
    }
}
