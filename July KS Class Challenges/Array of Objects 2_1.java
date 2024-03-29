import java.io.*;
import java.util.*;

class InstaIf{
    String name;
    int totalPosts;
    int totalReels;
    boolean blueTick;
    int followers;
    int following;
    String category;
    char gender;
    
    
    public InstaIf(String name,int totalPosts,int totalReels,boolean blueTick, int followers,int following, String category,char gender){
        this.name=name;
        this.totalPosts=totalPosts;
        this.totalReels=totalReels;
        this.blueTick=blueTick;
        this.followers=followers;
        this.following=following;
        this.category=category;
        this.gender=gender;
        
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        InstaIf arr[]=new InstaIf[n];
        
        for(int i=0;i<n;i++){
            String name=scn.next();
            int tP=scn.nextInt();
            int tR=scn.nextInt();
            boolean bT=scn.nextBoolean();
            int followers=scn.nextInt();
            int following=scn.nextInt();
            String cg=scn.next();
            char g=scn.next().charAt(0);
            
            InstaIf obj=new InstaIf(name,tP,tR,bT,followers,following,cg,g);
            
            arr[i]=obj;
        }
        
        for(int i=0;i<n;i++){
            InstaIf obj =arr[i];
            
            System.out.println(obj.name);
            System.out.println(obj.totalPosts);
            System.out.println(obj.totalReels);
            System.out.println(obj.blueTick);
            System.out.println(obj.followers);
            System.out.println(obj.following);
            System.out.println(obj.category);
            System.out.println(obj.gender);
             
        }
    }
}
