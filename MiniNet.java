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

    /** Default Constructor of Class MiniNet
     * 
     */
    public MiniNet()
    {
        //initialise the variables
        peopleList = new ArrayList<People>();
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
        //remove()
        boolean isDeleted = false;
        for (int i = 0 ; i < getNumbersOfPeople() ; i++)
        {
            if(getPeopleList().get(i).getName().equals(delPeopleName))
            {
                System.out.println(getPeopleList().get(i).getName() + " are deleted.");
                getPeopleList().remove(i);
                isDeleted = true;
            }                        
        }        
        if (! isDeleted)
        {
            System.out.println(" No matched People are deleted."); 
        }
    } 
    
    /**
     * A method to edit People to the list
     * 
     * @param editPeopleName the name of edit People
     * @return 
     */
    public void editPeople(String editPeopleName)
    {        
        //set()
        boolean isEdited = false;
        for (int i = 0 ; i < getNumbersOfPeople() ; i++)
        {
            if(getPeopleList().get(i).getName().equals(editPeopleName))
            {
                System.out.println(getPeopleList().get(i).getName() + " are edited.");
                getMovieList().get(i).cleanListOfActors();
               
                isEdited = true;
            }                        
        }        
        if (! isEdited)
        {
            System.out.println(" No matched People are Edited."); 
        }
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
        
        for (int i = 0 ; i < getNumbersOfPeople(); i++)
        {
            if(getPeopleList().get(i).getName().toLowerCase().contains(searchTitle))
                resultList.add(getPeopleList().get(i));
            
        }
                
        return resultList;
    }
    
}
