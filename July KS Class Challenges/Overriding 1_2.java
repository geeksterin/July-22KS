import java.io.*;
import java.util.*;

class Movies{
    int rating;
    int moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}

class CommercialMovies extends Movies{
    int views;
    int likes;
    
    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");
    }
    
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        CommercialMovies londonDream =new CommercialMovies();
        londonDream.rating =10;
        londonDream.moneyCollection=9000000;
        londonDream.profit=70000000;
        londonDream.leadActor="Salman Khan";
        londonDream.leadActress="Asin";
        londonDream.views=10000;
        londonDream.likes=500;
        
        londonDream.displayRating();
    }
}
