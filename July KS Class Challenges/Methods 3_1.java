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
    
    public YoutubeVideos (String song,String artist,int views,int likes,int releaseYear,int n,ArrayList<String>arr){
        this.song=song;
        this.artist=artist;
        this.views=views;
        this.likes=likes;
        this.releaseYear=releaseYear;
        this.n=n;
        this.arr=arr;
    }
    
    public void getProp(){
        
        System.out.println(song);
        System.out.println(artist);
        System.out.println(views);
        System.out.println(likes);
        System.out.println(releaseYear);
        System.out.println(n);
        
        
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
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
        
        
        YoutubeVideos obj=new YoutubeVideos(song,artist,views,likes,releaseYear,n,arr);
        
        obj.getProp();
        
        
        
    }
}
