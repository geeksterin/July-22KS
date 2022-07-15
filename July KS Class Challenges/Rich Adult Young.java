import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int age=scn.nextInt();
        int salary=scn.nextInt();
        
//         Age is greater than 40 or not
        if(age>40){
//             Check salary 
            if(salary>=30000){
                System.out.println("You are rich and adult");  // age>40 && salary >=300000
            }else {
                System.out.println("You are an adult"); // age>40 && salary<30000
            }
            
        }
        else{ // age is <=40
            if(salary>=12000){
                System.out.println("You are rich and young"); // age<=40 && salary>=12000
            }else{
                System.out.println("You are young"); // age<=40 && salary<12000
            }            
        }
        
    }
}
