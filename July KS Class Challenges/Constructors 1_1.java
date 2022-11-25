import java.io.*;
import java.util.*;

public class Solution {
    public static class Movies{
       int rating;
       int moneyCollection;
       int profit;
       String leadActor;
       String leadActress;
        
        public Movies(int rating,int moneyCollection, int profit,String leadActor,String leadActress){
            this.rating=rating;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            this.leadActor=leadActor;
            this.leadActress=leadActress;
        }
        
        void printDetails(){
            System.out.println(rating);
            System.out.println(moneyCollection);
            System.out.println(profit);
            System.out.println(leadActor);
            System.out.println(leadActress);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Movies Batman4=new Movies(9,700000,9000,"Jack","Alia");
        
        Batman4.printDetails();
    }
}
