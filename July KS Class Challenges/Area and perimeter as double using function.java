import java.io.*;
import java.util.*;

public class Solution {
    
    public static double area(double radius){
        
        return (3.14*radius*radius);
    }
    
    public static double perimeter(double radius){
        
        return (2*3.14*radius);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        double radius=scn.nextDouble();
        
        double ans1=area(radius);
        double ans2=perimeter(radius);
        
        
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
