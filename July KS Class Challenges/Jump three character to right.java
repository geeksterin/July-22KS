import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        char ch=scn.next().charAt(0);
//         condition for checking small case characters
        if(ch>='a' && ch<='z'){
            if(ch>='a' && ch<='w'){
                char printCharacter= (char)(ch+3);
                System.out.println(printCharacter);
            }else {
                System.out.println("Can’t jump");
            }
            
        }else {
            System.out.println("Not a small case");
        }
    }   
}
