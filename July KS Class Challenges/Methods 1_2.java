import java.io.*;
import java.util.*;

public class Solution {
    public static class Movies{
        String name;
        int rating;
        String moneyCollection;
        int profit;
        String leadActor;
        String leadActress;
        
        public Movies(String name,int rating,String moneyCollection,int profit,String leadActor,String leadActress){
            this.name=name;
            this.rating=rating;
            this.moneyCollection=moneyCollection;
            this.profit=profit;
            this.leadActor=leadActor;
            this.leadActress=leadActress;
            
        }
        boolean checkHit(){
            return this.rating>5?true:false;
            
            // if(rating >5) return true;
            // else return false
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Movies b1=new Movies("Batman 1",8,"200,000",5000,"John","Disha");
        Movies b2=new Movies("Batman 2",9,"500,000",8000,"Akshay","Anushka");
        Movies b3=new Movies("Batman 3",10,"700,000",6000,"Ajay","Deepika");
        
        System.out.println(b1.checkHit());
        System.out.println(b2.checkHit());
        System.out.println(b3.checkHit());
        
    }
}
