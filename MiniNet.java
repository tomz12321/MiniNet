import java.util.*;
import java.io.*;

/**
 * Write a description of class MiniNet here.
 * 
 * @author Jyhwoei Yang 
 * @version 22/03/2018
 */

public class MiniNet
{
    // instance variables - replace the example below with your own
    private ArrayList<People> peopleList;
    private Driver driver;

    /** Default Constructor of Class MiniNet
     * 
     */
    public MiniNet()
    {
        //initialise the variables
        peopleList = new ArrayList<People>();
        driver = new Driver();
    }

    public static void main(String[] args)
    {
        //create a driver object
        Driver newDriver = new Driver();
        
        //Hardcode Data
        People people1 = new People("Bryce", "30", "Andrew", "Cassie", ",Tom,Jerry,");
        People people2 = new People("Emma", "30", "Daniel", "Fiona", ",Tom,Jerry,");
        People people3 = new People("Tom", "5", "Bryce", "Emma", ",Tom,Jerry,");
        People people4 = new People("Jerry", "2", "Bryce", "Emma", ",Tom,Jerry,");
        People people5 = new People("Andy", "30", "George", "Holly", "");

        newDriver.addPeople(people1);
        newDriver.addPeople(people2);
        newDriver.addPeople(people3);
        newDriver.addPeople(people4);
        newDriver.addPeople(people5);
        Profile profile1 = new Profile("Bryce", "30", "Andrew", "Cassie" , ",Tom,Jerry,", "Image", "working at KFC", ",Andy,Bob,Charlie,David,");
        Profile profile2 = new Profile("Emma", "30", "Daniel", "Fiona" , ",Tom,Jerry,", "Image", "student at RMIT", ",Andy,Bob,Charlie,David,");
        Profile profile3 = new Profile();
        Profile profile4 = new Profile();
        Profile profile5 = new Profile("Andy", "30", "George", "Holly", "", "Image", "student at RMIT", ",Andy,Bob,Charlie,David,");
        newDriver.addProfile(profile1);
        newDriver.addProfile(profile2);
        newDriver.addProfile(profile3);
        newDriver.addProfile(profile4);
        newDriver.addProfile(profile5);

        newDriver.start();
    }

     /**
     * A method to add People to the list
     * 
     * @param People the People Object
     * @return 
     */
    public void addPeople(People newPeople)
    {
        peopleList.add(newPeople);
    } 
    
    /**
     * A method to delete People to the list
     * 
     * @param delPeopleName the name of delete People
     * @return 
     */
    public void deletePeople(String delPeopleName)
    {        
        //Remain Extensibility
    } 
    
    /**
     * A method to edit People to the list
     * 
     * @param editPeopleName the name of edit People
     * @return 
     */
    public void editPeople(String editPeopleName)
    {        
        //Remain Extensibility
    }
    
    /**
     * A method to search People
     * 
     * @param searchTitle the searchTitle
     * @return resultList the resultList
     */
    public ArrayList<People> searchPeople(String searchTitle) //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        ArrayList<People> resultList = new ArrayList<People>();
        //getNumbersOfPeople() .size
        for (int i = 0 ; i < peopleList.size(); i++)
        {
            if(peopleList.get(i).getName().toLowerCase().contains(searchTitle))
                resultList.add(peopleList.get(i));
            
        }
                
        return resultList;
    }
    
}
