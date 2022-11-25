import java.io.*;
import java.util.*;

class Influencers{
    String name;
    int totalPosts;
    int totalReels;
    String blueTick;
    int followers;
    int following;
    String category;
    char gender;
    
    public Influencers(String name,int tP,int tR,String bT,int fL,int fO,String ca,char g){
        this.name=name;
        this.totalPosts=tP;
        this.totalReels=tR;
        this.blueTick=bT;
        this.followers=fL;
        this.following=fO;
        this.category=ca;
        this.gender=g;
    }
    
    public void checkVerified(){
        if(blueTick.equals("No")){
             System.out.println("Needs Verification");
        }else {
            System.out.println("Already Verified");
        }
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
        String bT=scn.next();
        int fL=scn.nextInt();
        int fO=scn.nextInt();
        String ca=scn.next();
        char g=scn.next().charAt(0);
        
        Influencers obj=new Influencers(name,tP,tR,bT,fL,fO,ca,g);
        
        obj.checkVerified();
        
        
    }
}
