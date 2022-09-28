import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int positionFromLeftSide(String str,int left,int right){
        
        while(left<right){
            char ch=str.charAt(left);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                return left;
            }
            left++;
            
        }
        
        return -1;
    }
    
    public static int positionFromRightSide(String str,int right,int left){
        
        while(left<right){
            char ch=str.charAt(right);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                return right;
            }
            right--;
            
        }
        
        return -1;
    }
    
    public static void reverseLetters(String str){
        char arr[]=str.toCharArray();
        
        int left=0;
        int right=str.length()-1;
        
        while(left<right){
            
            left=positionFromLeftSide(str,left,right);
            right=positionFromRightSide(str,right,left);
            
            if(left==-1 || right==-1){
                break;
            }
            
            char ch=arr[left];
            arr[left]=arr[right];
            arr[right]=ch;
            
            left++;
            right--;
            
            
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.nextLine();
        
        reverseLetters(str);
    }
}
