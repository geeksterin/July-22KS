import java.io.*;
import java.util.*;

public class Solution {
    
    public static class Movies{
        String name;
        int ratings;
        int moneyCollection;
        int profit;
        String leadActor;
        String leadActress;
        static String videoType;
        
        
        // static {
        //     videoType="movies";
        // }
        
        public Movies(int ratings,int moneyCollection,int profit,String leadActor,String leadActress){
            this.ratings=ratings;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            this.leadActor=leadActor;
            this.leadActress=leadActress;
            
        }
    }
   
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Movies Superman1=new Movies(8,900000,8000,"Ranveer Singh","Katrina Kaif");
        Movies.videoType="movies";
        System.out.println(Superman1.videoType);
        System.out.println(Movies.videoType);
        
    }
}
