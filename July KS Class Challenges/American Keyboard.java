import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean checkInFirstRow(String str,String firstRow){
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(firstRow.indexOf(ch)==-1){
                return false;
            }
        }
        
        return true;
    }
    
     public static boolean checkInSecondRow(String str,String secondRow){
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(secondRow.indexOf(ch)==-1){
                return false;
            }
        }
        
        return true;
    }
    
     public static boolean checkInThirdRow(String str,String thirdRow){
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(thirdRow.indexOf(ch)==-1){
                return false;
            }
        }
        
        return true;
    }
    
    public static void americanKeyboard(String arr[]){
        
        String firstRow="qwertyuiop";
        String secondRow="asdfghjkl";
        String thirdRow="zxcvbnm";
        int flag=1;
        for(int i=0;i<arr.length;i++){
            String str=arr[i].toLowerCase();
            boolean ans1=checkInFirstRow(str,firstRow);
            boolean ans2=checkInSecondRow(str,secondRow);
            boolean ans3=checkInThirdRow(str,thirdRow);
            
            if(ans1==true || ans2==true || ans3==true){
                System.out.print(arr[i]+" ");
                flag=0;
            
            }
            
        }
        
        if(flag==1){
            System.out.println(-1);
        }
        
    }
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String arr[]=new String [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.next();
        }
        
        americanKeyboard(arr);
    }
}
