import java.io.*;
import java.util.*;

public class Solution {
    public static class Movies{
        String name;
        int rating;
        int moneyCollection;
        int profit;
        String leadActor;
        String leadActress;
        
        
        public Movies(int rating,int moneyCollection,int profit,String leadActor,String leadActress){
            this.rating=rating;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            this.leadActor=leadActor;
            this.leadActress=leadActress;
            
            System.out.println("Lead actor has the main role.");
        }
        
        public Movies(String leadActress,String leadActor,int rating,int moneyCollection,int profit){
            this.leadActress=leadActress;
            this.leadActor=leadActor;
            this.rating=rating;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            
            
            System.out.println("Lead actress has the main role.");
            
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Movies Superman1=new Movies(8,900000,8000,"Ranveer Singh","Katrina Kaif");
        Movies Superman2=new Movies("Vani Gupta", "Raj Gupta",9,1900000,28000);
    }
}
