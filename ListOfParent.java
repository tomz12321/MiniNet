import java.util.*;

/**
 * Design a class ListOfParents. Keep the flexability for parent list.
 * 
 * @author Jyh-woei Yang  
 * @version 22/03/2018
 */
public class ListOfParent
{   
    private ArrayList<People> parentList;    
    private int sampleSize;
    
    /** Default Constructors of class ListOfParent
     * 
     */
    public ListOfParent()
    {
        //initialised the variables 
        parentList = new ArrayList<People>();
        sampleSize = 3;
    }
    
    /**
     * A method to add Actor to the list
     * 
     * @param newActor an Object Actors
     * @return 
     */
    public void addPeople(People newPeople)
    {
        parentList.add(newPeople);
    }
    
    /**
     * A method to get list of Parent 
     * 
     * @param
     * @return a list of Parent
     */
    public ArrayList<People> getListOfParent()
    {
       return parentList;
    }
    
    /**
     * A method to return the size of actor list
     * 
     * @param
     * @return count number of Parent
     */
    public int getNumbersOfParent()
    {
        //return parentList.size();
        return sampleSize;
    } 
    
    /**
     * A method to get list of Parent 
     * 
     * @param
     * @return listString a list of Parent as a String
     */
    public String getStringOfListOfParent()
    {
        int listSize = parentList.size();
        String listString = parentList.get(0).getName();
        for (int i = 1 ; i < listSize ; i++ )
            listString = listString + "," + parentList.get(i).getName();
        return listString;
    }
    
    /**
     * List all the Parent currently in the database on standard out.
     */
    public void listAll() 
    {
        for (Iterator i = parentList.iterator(); i.hasNext();)         
            System.out.println(i.next());
        
    }
    
    /**
     * A method to set list of Parent 
     * 
     * @param ArrayList the newParentList
     * @return 
     */
    public void setListOfParent(ArrayList<People> newParentList)
    {              
        //change to pass arraylist (set it before pass)
        for (int i = 0 ; i < newParentList.size() ; i++ )
            parentList.add(newParentList.get(i));
        //actorsList.add(newActorlist.get(1));
        //actorsList.add(newActorlist.get(2));
    }    
}
