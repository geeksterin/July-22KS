import java.io.*;
import java.util.*;

public class Solution {
    public static class instaInfluencers{
        String name;
        int totalPosts;
        int totalReels;
        String blueTick;
        int followers;
        int following;
        String category;
        char gender;
        
        public instaInfluencers(String name,int totalPosts, int totalReels,String blueTick,int followers,int following,String category,char gender){
            this.name=name;
            this.totalPosts=totalPosts;
            this.totalReels=totalReels;
            this.blueTick=blueTick;
            this.followers=followers;
            this.following=following;
            this.category=category;
            this.gender=gender;
        }
        
        void printDetailsWithoutName(){
            
            System.out.println(totalPosts);
            System.out.println(totalReels);
            System.out.println(blueTick);
            System.out.println(followers);
            System.out.println(following);
            System.out.println(category);
            System.out.println(gender);
        }
        
        void printDetails(){
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
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        instaInfluencers raftaarMusic =new instaInfluencers("Raftaar",340,400,"Yes",7,200,"Rapper",'M');
        instaInfluencers nikhilChinapa =new instaInfluencers("Nikhil Chinapa",500,220,"Yes",5,210,"VJ",'M');
        instaInfluencers baseerBob = new instaInfluencers("Baseer",500,120,"No",2,230,"VJ",'M');
        
        raftaarMusic.printDetailsWithoutName();
        nikhilChinapa.printDetails();
        baseerBob.printDetails();
    }
}
