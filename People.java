import java.util.*;

/**
 * Design a class People
 * 
 * @author Jyh-woei Yang 
 * @version 14/03/2018
 */

public class People
{
    // instance variables - replace the example below with your own
    private String title;
    private String director;
    private int rating;

    /**
     * Constructor for objects of class People
     */
    public People()
    {
        // initialise instance variables
        title = "";
        director = "";
        rating = 0;
    }

    /**
     * A method to test displaying object displayPeople attibutes
     * 
     * @param
     * @return 
     */
    public void displayPeopleRecord()
    {
        //method to test displaying attributes of the movie
        System.out.print(title + ",");
        System.out.print(director + ",");
        System.out.println(rating);
    }
    
        
    /**
     * A method to return director
     * 
     * @param
     * @return director the movie director 
     */
    public String getDirector()
    {
        //method to get director name
        return director;
    }
   
    
    /**
     * A method to return rating
     * 
     * @param
     * @return rating the movie rating 
     */
    public int getRating()
    {
        // method to get movie rating
        return rating;
    }
            
    /**
     * A method to return title
     * 
     * @param  
     * @return title the movie title
     */
    public String getTitle()
    {
        //method to get movie title
        return title;
    }
    
    
    /**
     * A method to set director
     * 
     * @param  movieDirector the movie director
     * @return 
     */
    public void setDirector(String movieDirector)
    {
        //method to set director
        director = movieDirector;
    }
    
    /**
     * A method to set rating
     * 
     * @param  movieRating the movie rating
     * @return  
     */
    public void setRating(int movieRating)
    {
        //method to set a movie rating
        rating = movieRating;
    }
    
    /**
     * A method to set title
     * 
     * @param  movieTitle the movie title
     * @return      
     */
    public void setTitle(String movieTitle)
    {
        //method to set title
        title = movieTitle;
    }
}
