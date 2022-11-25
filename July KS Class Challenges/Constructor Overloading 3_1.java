import java.io.*;
import java.util.*;

class YoutubeVideos{
    String song;
    String artist;
    int views;
    int likes;
    int releaseYear;
    int n;
    ArrayList<String>arr;
    
    public YoutubeVideos (String song,String artist,int views,int likes){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        
        System.out.println("The song has just released");
    }
    
    public YoutubeVideos (String song,String artist,int views,int likes,int releaseYear){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releaseYear=releaseYear;
        
        System.out.println("The song was released in " + releaseYear);
        
        
        
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
        
        int k=scn.nextInt();
        
        if(k==1){
            YoutubeVideos obj=new YoutubeVideos(song,artist,views,likes);
        }
        else if(k==2){
            YoutubeVideos obj=new YoutubeVideos(song,artist,views,likes,releaseYear);
        }
        
        
        
        
        
    }
}
