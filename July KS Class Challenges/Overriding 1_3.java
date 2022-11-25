import java.io.*;
import java.util.*;

class Movies{
    String name;
    int rating;
    int moneyCollection;
    int profit;
    String leadActor;
    String leadActress;
    
    public void displayRating(){
        // System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}

class CommercialMovies extends Movies{
    int views;
    int likes;
    
    public void displayRating(){
        // System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");
    }
    
    
}


class CreativeMovies extends Movies{
    int views;
    int likes;
    
    public void displayRating(){
        // System.out.println(rating);
        System.out.println("Inside the creativeMovies class");
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        CommercialMovies londonDreams=new CommercialMovies();
        
        londonDreams.name="London Dreams";
        londonDreams.rating=10;
        londonDreams.moneyCollection=9000000;
        londonDreams.profit=70000000;
        londonDreams.leadActor="Salman Khan";
        londonDreams.leadActress="Asin";
        londonDreams.views=10000;
        londonDreams.likes=500;
        
        
        CreativeMovies andhadhun=new CreativeMovies();
        
        andhadhun.name="Andhadhun";
        andhadhun.rating=10;
        andhadhun.moneyCollection=7000000;
        andhadhun.profit=800000;
        andhadhun.leadActor="Ayushman Khurana";
        andhadhun.leadActress="Disha";
        andhadhun.views=20000;
        andhadhun.likes=400;
        
        londonDreams.displayRating();
        andhadhun.displayRating();
        
        
    }
}
