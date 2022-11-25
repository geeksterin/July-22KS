import java.io.*;
import java.util.*;

class Influencers{
    String name;
    int totalPosts;
    int totalReels;
    boolean blueTick;
    int followers;
    int following;
    String category;
    char gender;
    
    public void printDetails(){
        System.out.println(name);
        System.out.println(totalPosts);
        System.out.println(totalReels);
        System.out.println(blueTick);
        System.out.println(followers);
        System.out.println(following);
        System.out.println(category);
        System.out.println(gender);
    }
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String object=scn.nextLine();
        String name=scn.nextLine();
        int tP=scn.nextInt();
        int tR=scn.nextInt();
        boolean bT=scn.nextBoolean();
        int fL=scn.nextInt();
        int fO=scn.nextInt();
        String ca=scn.next();
        char g=scn.next().charAt(0);
        
        Influencers obj=new Influencers();
        obj.name=name;
        obj.totalPosts=tP;
        obj.totalReels=tR;
        obj.blueTick=bT;
        obj.followers=fL;
        obj.following=fO;
        obj.category=ca;
        obj.gender=g;
        
        obj.printDetails();
        
    }
}
