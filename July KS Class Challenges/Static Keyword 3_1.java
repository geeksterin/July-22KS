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
    static int totalVideos=0;
    
    public YoutubeVideos (String song,String artist,int views,int likes,int releaseYear,ArrayList<String>arr){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releaseYear=releaseYear;
        this.arr=arr;
    }
    
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        scn.nextLine();
        for(int i=0;i<x;i++){
            String song=scn.nextLine();
            String artist=scn.nextLine();
            int views=scn.nextInt();
            scn.nextLine();
            int likes=scn.nextInt();
            scn.nextLine();
            int releaseYear=scn.nextInt();
            int n=scn.nextInt();
            scn.nextLine();
            ArrayList<String>arr=new ArrayList<>();

            for(int j=0;j<n;j++){
                String s=scn.nextLine();
                arr.add(s);
            }

            YoutubeVideos obj = new YoutubeVideos(song,artist,views,likes,releaseYear,arr);
            obj.totalVideos+=1;
        }
        
        System.out.println(YoutubeVideos.totalVideos);
        
    }
}
