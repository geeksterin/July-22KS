import java.io.*;
import java.util.*;

public class Solution {
   
    public static class Movies{
        int ratings;
        int moneyCollection;
        int profit;
        String leadActor;
        String leadActress;
        
        public Movies(int ratings,int moneyCollection,int profit,String leadActor, String leadActress){
            this.ratings=ratings;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            this.leadActor=leadActor;
            this.leadActress=leadActress;
        }
        
        void printMovieDetails(){
            System.out.println(ratings);
            System.out.println(moneyCollection);
            System.out.println(profit);
            System.out.println(leadActor);
            System.out.println(leadActress);
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Movies batman1=new Movies(8,200000,5000,"John","Disha");
        Movies batman2=new Movies(9,500000,8000,"Akshay","Anushka");
        Movies batman3=new Movies(10,700000,6000,"Ajay","Deepika");
        
        batman1.printMovieDetails();
        batman2.printMovieDetails();
        batman3.printMovieDetails();
        
    }
}
