import java.util.*;

/**
 * Design a class Profile
 * 
 * @author Jyh-woei Yang 
 * @version 22/03/2018
 */

public class Profile extends People
{
    // instance variables - replace the example below with your own
    private String image; //optionImage
    private String status; //“working at KFC”,“student at RMIT”, “freelance”,“looking for jobs”
    private String friendList;

    /**
     * Default Constructor for objects of class Profile
     */
    public Profile()
    {
        // initialise instance variables
        image = "";
        status = "";
        friendList = "";
    }

    /**
     * Constructor for objects of class Profile
     */
    public Profile(String name, String age, String father,String mother,String children, String image, String status, String friendList)
    {
        // initialise instance variables
        super(name, age, father, mother, children);
        this.image = image;
        this.status = status;
        this.friendList = friendList;
    }

    /**
     * A method to test displaying object displayProfile attibutes
     * 
     * @param
     * @return 
     */
    public void displayProfileRecord()
    {
        //method to test displaying attributes of the profile
        System.out.print(image + ",");
        System.out.print(status + ",");
        System.out.println(friendList);
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
    public void setFriendList(String profileFriendList)
    {
        //method to set profile friendList
        friendList = profileFriendList;
    }
       
}
