import java.util.*;

/**
 * Design a class People
 * 
 * @author Jyh-woei Yang 
 * @version 14/03/2018
 */

public class People extends MiniNet
{
    // instance variables - replace the example below with your own
    private String name;
    private String age;
    private String father;
    private String mother;
    private String children;

    /**
     * Constructor for objects of class People
     */
    public People()
    {
        // initialise instance variables
        name = "";
        age = "";
        father = "";
        mother = "";
        children = "";
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
        System.out.print(name + ",");
        System.out.print(age + ",");
        System.out.print(father + ",");
        System.out.print(mother + ",");
        System.out.println(children);
    }
    
        
    /**
     * A method to return name
     * 
     * @param
     * @return name the people name 
     */
    public String getName()
    {
        //method to get people name
        return name;
    }
   
    
    /**
     * A method to return age
     * 
     * @param
     * @return age the people age 
     */
    public int getAge()
    {
        // method to get movie rating
        return age;
    }
            
    /**
     * A method to return father
     * 
     * @param  
     * @return father the people father
     */
    public String getFather()
    {
        //method to get people father
        return father;
    }
 
    /**
     * A method to return mother
     * 
     * @param  
     * @return mother the people mother
     */
    public String getMother()
    {
        //method to get people mother
        return mother;
    }

    /**
     * A method to return children
     * 
     * @param  
     * @return children the people children
     */
    public String getChildren()
    {
        //method to get people children
        return children;
    }     
    
    /**
     * A method to set name
     * 
     * @param  peopleName the people name
     * @return 
     */
    public void setName(String peopleName)
    {
        //method to set name
        name = peopleName;
    }
    
    /**
     * A method to set age
     * 
     * @param  peopleAge the people age
     * @return  
     */
    public void setAge(String peopleAge)
    {
        //method to set a movie rating
        age = peopleAge;
    }
    
    /**
     * A method to set father
     * 
     * @param  peopleFather the people father
     * @return      
     */
    public void setFather(String peopleFather)
    {
        //method to set father
        father = peopleFather;
    }

    /**
     * A method to set mother
     * 
     * @param  peopleMother the people mother
     * @return      
     */
    public void setMother(String peopleMother)
    {
        //method to set mother
        mother = peopleMother;
    }

    /**
     * A method to set children
     * 
     * @param  peopleChildren the people children
     * @return      
     */
    public void setChildren(String peopleChildren)
    {
        //method to set mother
        children = peopleChildren;
    }
}
