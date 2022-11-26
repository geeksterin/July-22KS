import java.io.*;
import java.util.*;

class YoutubeVideos{
    String song;
    String artist;
    int views;
    int likes;
    int releaseYear;
    ArrayList<String>arr;
    
    public void printTempRank(){
        System.out.println("Method of youtubeVideo class. Can't find the rank right now.");
    }
    
    
}


class ShortVideos extends YoutubeVideos{
    
    public void printTempRank(){
        super.printTempRank();
        System.out.println((views+likes)/100);
    }
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String song=scn.nextLine();
        String artist=scn.nextLine();
        int views=scn.nextInt();
        int likes=scn.nextInt();
        int releaseYear=scn.nextInt();
        int n=scn.nextInt();
        scn.nextLine();
        ArrayList<String>arr=new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            String s=scn.nextLine();
            arr.add(s);
        }
        
        
        
        ShortVideos obj=new ShortVideos();
        
        obj.printTempRank();
        
        
        
    }
}
