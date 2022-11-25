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
    
    public void displayViews(){
        System.out.println(views);
    }
    
    public void displayLikes(){
        System.out.println(likes);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Movies superman1=new Movies("Superman 1",8,90000,1000,"Ranveer","Katrina",10000,500);
        System.out.println(superman1.rating);
        System.out.println(superman1.moneyCollection);
        System.out.println(superman1.profit);
        System.out.println(superman1.leadActor);
        System.out.println(superman1.leadActress);
        
        
        superman1.displayViews();
        superman1.displayLikes();
    }
}
