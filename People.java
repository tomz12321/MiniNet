import java.util.*;

/**
 * Design a class People
 * 
 * @author Jyh-woei Yang 
 * @version 23/03/2018
 */

public class People
{
    // instance variables - replace the example below with your own
    private String name;
    private String age;
    private String father;
    private String mother;
    private String childrenList;

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
        childrenList = "";
    }

    public People(String name, String age, String father, String mother, String childrenList)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.childrenList = childrenList;
    }

    /**
     * A method to test displaying object displayPeople attibutes
     * 
     * @param
     * @return 
     */
    public void displayPeopleRecord()
    {
        //method to test displaying attributes of the people
        System.out.print(name + ",");
        System.out.print(age + ",");
        System.out.print(father + ",");
        System.out.print(mother + ",");
        System.out.println(childrenList);
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
    public String getAge()
    {
        // method to get people age
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
        return childrenList;
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
        //method to set a people age
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
        childrenList = peopleChildren;
    }
}
