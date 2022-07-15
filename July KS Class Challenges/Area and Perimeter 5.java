import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int l = input.nextInt(); //  Length of rectangle.
        int b = input.nextInt(); //   Breadth of rectangle.
        
        int area = l*b;         // Area of rectangle.
        
        System.out.println(area);
        int per = 2*(l+b);
        System.out.println(per);

    }
}
