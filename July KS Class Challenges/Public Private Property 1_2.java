import java.io.*;
import java.util.*;

class Movies{
    public String name;
    public int rating;
    public int moneyCollection;
    public int profit;
    public String leadActor;
    public String leadActress;
    private int views;
    private int likes;
    
    public Movies(String name,int rating,int moneyCollection,int profit, String leadActor,String leadActress,int views,int likes){
        this.name=name;
        this.rating=rating;
        this.moneyCollection=moneyCollection;
        this.profit=profit;
        this.leadActor=leadActor;
        this.leadActress=leadActress;
        this.views=views;
        this.likes=likes;
    }
    
    public int  displayViews(){
        return views;
    }
    
    public int displayLikes(){
         return likes;
    }
    
    private int calculateGrade(int views,int likes){
        int finalGrade=10*likes+views;
        return finalGrade;
    }
    
    public int printGrade(int likes,int views){
        int ans=calculateGrade(views,likes);
        return ans;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Movies superman1=new Movies("Superman 1",8,90000,1000,"Ranveer","Katrina",10000,500);
        
        int views=superman1.displayViews();
        int likes=superman1.displayLikes();
        
        int ans=superman1.printGrade(likes,views);
        System.out.println(ans);
        
       
    }
}
