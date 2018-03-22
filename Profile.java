import java.util.*;

/**
 * Design a class Profile
 * 
 * @author Jyh-woei Yang 
 * @version 22/03/2018
 */

public class Profile
{
    // instance variables - replace the example below with your own
    private String name;
    private String image; //optionImage
    private String status; //“working at KFC”,“student at RMIT”, “freelance”,“looking for jobs”
    private String friendList;

    /**
     * Constructor for objects of class People
     */
    public Profile()
    {
        // initialise instance variables
        name = "";
        image = "";
        status = "";
        friendList = "";
    }

    /**
     * A method to test displaying object displayPeople attibutes
     * 
     * @param
     * @return 
     */
    public void displayProfileRecord()
    {
        //method to test displaying attributes of the movie
        System.out.print(name + ",");
        System.out.print(image + ",");
        System.out.print(status + ",");
        System.out.println(friendList);
    }

    /**
     * A method to return name
     * 
     * @param
     * @return name the profile name 
     */
    public String getName()
    {
        //method to get profile name
        return name;
    }

    /**
     * A method to return image
     * 
     * @param
     * @return name the profile image 
     */
    public String getImage()
    {
        //method to get profile image
        return image;
    }

    /**
     * A method to return status
     * 
     * @param
     * @return name the profile status 
     */
    public String getStatus()
    {
        //method to get profile status
        return status;
    }

    /**
     * A method to return status
     * 
     * @param
     * @return name the profile friendList 
     */
    public String getFriendList()
    {
        //method to get profile friendList
        return friendList;
    }

    /**
     * A method to set name
     * 
     * @param  profileName the profile name
     * @return 
     */
    public void setName(String profileName)
    {
        //method to set name
        name = profileName;
    }

    /**
     * A method to set image
     * 
     * @param  profileImage the profile image
     * @return 
     */
    public void setImage(String profileImage)
    {
        //method to set image
        image = profileImage;
    }

    /**
     * A method to set status
     * 
     * @param  profileStatus the profile status
     * @return 
     */
    public void setStatus(String profileStatus)
    {
        //method to set status
        status = profileStatus;
    }

    /**
     * A method to return friendList
     * 
     * @param
     * @return friendList the profile friendList 
     */
    public String setFriendList(String profileFriendList)
    {
        //method to set profile friendList
        friendList = profileFriendList;
    }
       
}
