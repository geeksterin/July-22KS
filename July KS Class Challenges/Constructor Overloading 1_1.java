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
        
//         Parameterized constructor -1
        public Movies(int rating, int moneyCollection){
            this.rating =rating;
            this.moneyCollection=moneyCollection;
            
            System.out.println("Stored rating and money.");
        }
        
        //         Parameterized constructor -2
        public Movies(int rating, int moneyCollection,int profit){
            this.rating =rating;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            
            System.out.println("Stored rating, money, profit are given.");
        }
        
        
        //         Parameterized constructor -3
        public Movies(int rating, int moneyCollection,int profit,String leadActor){
            this.rating =rating;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            this.leadActor=leadActor;
            
            System.out.println("Stored rating, money, profit, lead actors are given.");
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Movies Superman1=new Movies(8,900000);
        Movies Superman2=new Movies(8,900000,8000);
        Movies Superman3=new Movies(8,900000,8000,"Ranveer Singh");
    }
}
