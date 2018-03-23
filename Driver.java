import java.lang.*;
import java.util.*;
import java.io.*;

/**
 * Write a description of class Driver here.
 * 
 * @author Jyh-woei Yang 
 * @version 22/03/2018
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private ArrayList<People> peopleList;
    private ArrayList<Profile> profileList;

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        //initialise the variables

        peopleList = new ArrayList<People>();
        profileList = new ArrayList<Profile>(); 
    }
 
    /**
     * A method to display Menu
     * 
     * @param
     * @return 
     */

    public void displayMenu()
    {
        //interface
        System.out.println("");
        System.out.println("=====================");
        System.out.println("(1) Add a person into the network");
        System.out.println("(2) Select a person by name");
        System.out.println("(3) Display the profile of the selected person");
        System.out.println("(4) Update the profile information of the selected person");
        System.out.println("(5) Delete the selected person");
        System.out.println("(6) Connect two persons in a meaningful way");
        System.out.println("(7) Find out whether a person is a direct friend of another person");
        System.out.println("(8) Find out the name(s) of a person’s child(ren)");
        System.out.println("(9) Find out the names of the parents");
        System.out.println("(0) Exit System");
        System.out.print("Choose an option :");
    }

    /**
     * A method to start operating the system
     * 
     * @param
     * @return 
     */
    public void start()
    {
        //Scanner
        Scanner input = new Scanner(System.in);
        Boolean isOperating = true;

        int selectedItemNo = 0; // number of selected item

        //read from file
        //readFile();

        while (isOperating)
        {                        
            //display menu 
            displayMenu();

            //insert case
            String iobuffer = input.nextLine(); 
            System.out.println("");

            //check console.nextLine() is not null or blank
            if (validBlank(iobuffer,"Option"))
            { 
                char option = iobuffer.charAt(0);

                //if option not in 0,1,2,3,4,5..9 Error message: please insert from (0) to (9)!
                if (validOption(option))
                {
                    switch (option)
                    {
                        case '1':
                        System.out.println("=== (1) Add a person into the network ===");
                        //add Person to the peopleList
                            inputAddPeople();
                        break;
                        case '2':
                        System.out.println("=== (2) Select a person by name ===");
                        //display() All people from the list
                            listAllNames();
                        //select
                            selectedItemNo = selectPerson();
                            System.out.println("" + peopleList.get(selectedItemNo - 1).getName() + " are selected.");
                        break;
                        case '3':
                        //Display the profile of the selected person
                        System.out.println("=== (3) Display the profile of the selected person ===");

                        //display the profile of the selected person
                        System.out.println("ID:" + selectedItemNo);
                        System.out.println("Name:" + peopleList.get(selectedItemNo - 1).getName());
                        System.out.println("Image::" + profileList.get(selectedItemNo - 1).getImage());
                        System.out.println("Status:" + profileList.get(selectedItemNo - 1).getStatus());
                        System.out.println("Friend List:" + profileList.get(selectedItemNo - 1).getFriendList());

                        break;
                        case '4':
                        System.out.println("=== (4) Update the profile information of the selected person ===");  


                        //set the profile of the selected person
                        System.out.println("ID:" + selectedItemNo);
                        System.out.println("Name:"); 
                            peopleList.get(selectedItemNo - 1).setName("NameExample");
                        System.out.println("Image::");
                            profileList.get(selectedItemNo - 1).setImage("ImageExample");
                        System.out.println("Status:");
                            profileList.get(selectedItemNo - 1).setStatus("StatusExample");
                        System.out.println("Friend List:"); 
                            profileList.get(selectedItemNo - 1).setFriendList("FriendListExample");

                        //result
                        System.out.println("== Result ==");
                        System.out.println("ID:" + selectedItemNo);
                        System.out.println("Name:" + peopleList.get(selectedItemNo - 1).getName());
                        System.out.println("Image::" + profileList.get(selectedItemNo - 1).getImage());
                        System.out.println("Status:" + profileList.get(selectedItemNo - 1).getStatus());
                        System.out.println("Friend List:" + profileList.get(selectedItemNo - 1).getFriendList());
                        
                          
                        break;
                        case '5':
                        //Delete the selected person
                        //ArrayList.remove();
                        System.out.println("=== (5) Delete the selected person ===");
                            //remove
                        
                            peopleList.remove(selectedItemNo -1);
                        break;
                        case '6':
                        //Connect two people in a meaningful way (Friends)
                        System.out.println("=== (6) Connect two persons in a meaningful way ===");
                            connect(peopleList.get(0),peopleList.get(1),profileList.get(0),profileList.get(1));
                        break;

                        case '7':
                        //Find out whether a person is a direct friend of another person
                        //search();
                        System.out.println("=== (7) Find out whether a person is a direct friend of another person ===");
                            //searchFriend();
                            searchFriends();
                        break;
                        case '8':
                        //Find out the name(s) of a person’s child(ren)
                        //search();
                        System.out.println("=== (8) Find out the name(s) of a person’s child(ren) ===");
                            searchFather();
                            searchMother();
                        break;
                        case '9':
                        //Find out the names of the parents
                        //search();
                        System.out.println("=== (9) Find out the names of the parents ===");
                        break;
                        case '0':
                        //Exit system, and reset variables
                        System.out.println("=== (0) Exit System ===");
                        isOperating = exitSystem();
                        break;
                    }
                }

                if (!isOperating)
                {
                    System.out.println("");
                    System.out.println("Thank you for using MiniNet System, Goodbye!");
                }
            }
        }
    }

    /**
     * A method to exit the system
     * 
     * @param
     * @return a boolean to make isOperating = false and break the while loop
     */
    private boolean exitSystem()
    {
        System.out.println("Exit System");
        //write into file
        //writeFile();

        //reset all the attributes
        peopleList = new ArrayList<People>();
        profileList = new ArrayList<Profile>(); 

        return false;
    }

    /**
     * A method to add people to the MiniNet system
     * 
     * @param
     * @return 
     */
    public void addPeople(People newPeople)
    {
        //input

        peopleList.add(newPeople);        
        //outprint to testing
        //System.out.println("== Result: Adding people to the list ==");
        //newPeople.displayPeopleRecord();

    }

    /**
     * A method to add people to the MiniNet system
     * 
     * @param
     * @return 
     */
    public void addProfile(Profile newProfile)
    {
        //input

        profileList.add(newProfile);
        
        //outprint to testing
        //System.out.println("== Result: Adding profile to the list ==");
        //newProfile.displayProfileRecord();

    }
    
    /**
     * A method to connect two people (Friends)
     * 
     * @param People people1, People people2, Profile profile1, Profile profile2
     * @return
     */
    private void connect(People people1, People people2, Profile profile1, Profile profile2)
    {
        //if (maleParent)
        //    people1.setFather(people2.getName());
        //else if(femaleParent)
        //    people1.setMother(people2.getName());
        //else if(friend)
        //    {
                profile1.setFriendList(profile1.getFriendList() + "," + people2.getName());
                profile2.setFriendList(profile2.getFriendList() + "," + people1.getName());
        //    }
        
    }

    /**
     * A method to return elements from the peopleList
     * 
     * @param index the index
     * @return elements in the peopleList
     */
    public People getPeople(int index)
    {
        return peopleList.get(index);
    }
    
    /**
     * A method to return the whole peopleList
     * 
     * @param 
     * @return the whole peopleList
     */
    public ArrayList<People> getPeopleList()
    {
        return peopleList;
    }
    
    /**
     * A method to return the size of peopleList
     * 
     * @param
     * @return count number of People
     */
    public int getNumbersOfPeople()
    {
        return peopleList.size();
    }   
    
    /**
     * List all the people currently in the database on standard out.
     */
    public void listAllNames() 
    {
        System.out.println("People in MiniNet:");
        for (int i = 0 ; i < peopleList.size() ; i++)
            //peopleList.get(i).displayPeopleRecord();
            System.out.println( (i + 1) +")" + peopleList.get(i).getName());

    }

    /**
     * select all the people currently in the database on standard out.
     *
     * @param
     * @return int index number of select item
     */
    public int selectPerson()
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("=== Select People ===");
        System.out.println("Please insert people number :");
        String index = input.nextLine();
        return convertStringtoInt(index);
    }
    //old code

    /**
     * A method to add people to the MiniNet system
     * 
     * @param
     * @return 
     */
    public void inputAddPeople()
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("=== Add People ===");
        System.out.println("Please insert people name :");        
        String newPeopleName = input.nextLine();

        //valid addPeopleName if existed , Error message
        while (validPeopleName(newPeopleName))
            newPeopleName = input.nextLine();                  

        //valid addPeople if blank , Error message    
        while (validBlank(newPeopleName,"People Name"))
        {
            newPeopleName = input.nextLine();
            //valid addPeopleName if existed , Error message
            while (validPeopleName(newPeopleName))
                newPeopleName = input.nextLine(); 
        }        
        System.out.println("Please insert people age :");

        //input people age
        String newPeopleAge = input.nextLine();

        while (validBlank(newPeopleAge,"People Age"))
            newPeopleAge = input.nextLine();

        System.out.println("Please insert Father name :");

        //input Father's name
        String newFatherName = input.nextLine();

        while (validBlank(newFatherName,"Father Name"))
            newFatherName = input.nextLine();

        System.out.println("Please insert Mother name :");
        //input Mother's name
        String newMotherName = input.nextLine();

        while (validBlank(newMotherName,"Mother Name"))
            newMotherName = input.nextLine();

        System.out.println("Please insert Children name :");
        //input Children's name
        String newChildrenName = input.nextLine();

        while (validSpace(newChildrenName))
            newChildrenName = input.nextLine();

        
        //add people to the list
        People newPeople = new People(); 
        newPeople.setName(newPeopleName);
        newPeople.setAge(newPeopleAge);
        //Assume Father+Mother+Children is a set of 3 people
        String[] elements = new String[3];
        //Make a list for a set of 3 people
        
        elements[0] = newFatherName;
        elements[1] = newMotherName;
        elements[2] = newChildrenName;
        
        //parent list , using for loop to handle it

        /*for (int i = 0 ; i < 3 ; i++ )
        {
            String parentName;
            
            newPeople.parentName(elements[i]);
            newActorList.addActor(newActor);
        }
        newPeople.setName(newPeopleName);
        newPeople.setAge(newPeopleAge);
        */
        newPeople.setFather(newFatherName);
        newPeople.setMother(newMotherName);
        newPeople.setChildren(newChildrenName);
        
        //outprint to testing
        newPeople.displayPeopleRecord();

        //add to People List
        addPeople(newPeople);
    }

    /**
     * Method to convert from String to Integer
     * 
     * @param a String of input
     * @return the Integer of out
     * @throws NumberFormatException if input is a non-number format
     */
    private int convertStringtoInt(String input) //method to convert String to Integer
    {
        //intialised variables
        String S = input;
        int i = 0;
        //try catch to handle NumberFormatException
        try
        {
            // the String to int conversion happens here
            i = Integer.parseInt(input.trim());

            // print out the value after the conversion
            //System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage() + ", please input an integer!");
        }
        return i;
    }

    /**
     * A method to delete people from the Mininet system
     * if there are above two people appearing on the search result
     * provide choosing options
     * 
     * @param
     * @return 
     */
    private void deletePeople()
    {
       //Remain Extensibility
       System.out.println("Delete People : ");           
    }

    /**
     * A method to edit people from the MiniNet system
     * if there are above two people appearing on the search result
     * provide choosing options
     * 
     * @param
     * @return 
     */
    private void editPeople()
    {
        //Remain Extensibility
        System.out.println("Edit People :");        
    }

    

    /**
     * A method to select search by people Name or people Age
     * 
     * @param
     * @return
     */
    private void searchCase() //validBlank and validDelSelection to valid case option are between (1) and (2)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Press (1) To search by People Name or (2) To search by People Age");        
        String iobuffer = input.nextLine();
        char option = ' '; 

        while(validBlank(iobuffer.trim(),"Options"))
            iobuffer = input.nextLine();

        while(validLimitSelection(convertStringtoInt(iobuffer.trim()), 2))
        {
            iobuffer = input.nextLine();
            //validate Option is blank
            while(validBlank(iobuffer.trim(),"Options"))    
                iobuffer = input.nextLine();
        }
        option = iobuffer.charAt(0);

        switch (option)
        {
            case '1':                        
            //search People from the list by Name
            break;

            case '2':
            //search People from the list by Age
            break;                                
        }
    }

    /**
     * A method to search friends
     * 
     * @param
     * @return 
     */
    private void searchFriends() //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        System.out.println("=== Search People ===");
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Search People , please insert a keyword to search by name:");
        String searchTitle = "," + input.nextLine().toLowerCase() + ",";

        while(validBlank(searchTitle,"People Name"))
            searchTitle = input.nextLine().toLowerCase();

        //display People details
        System.out.println("Search Result");
        for (int j = 0 ; j < profileList.size() ; j++)
        {
            if(profileList.get(j).getFriendList().toLowerCase().contains(searchTitle))
                peopleList.get(j).displayPeopleRecord();
        }

        if (peopleList.size() == 0)
            System.out.println("No matched result");
        
    }

    /**
     * A method to search father
     * 
     * @param
     * @return 
     */
    private void searchFather() //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        System.out.println("=== Search People ===");
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Search People , please insert a keyword to search by name:");
        String searchTitle = input.nextLine().toLowerCase();

        while(validBlank(searchTitle,"People Name"))
            searchTitle = input.nextLine().toLowerCase();

        //display People details
        System.out.println("Search Result");
        for (int j = 0 ; j < peopleList.size() ; j++)
        {
            if(peopleList.get(j).getFather().toLowerCase().equals(searchTitle))
                peopleList.get(j).displayPeopleRecord();
        }

        if (peopleList.size() == 0)
            System.out.println("No matched result");
        
    }

     /**
     * A method to search mother
     * 
     * @param
     * @return 
     */
    private void searchMother() //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        System.out.println("=== Search People ===");
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Search People , please insert a keyword to search by name:");
        String searchTitle = input.nextLine().toLowerCase();

        while(validBlank(searchTitle,"People Name"))
            searchTitle = input.nextLine().toLowerCase();

        //display People details
        System.out.println("Search Result");
        for (int j = 0 ; j < peopleList.size() ; j++)
        {
            if(peopleList.get(j).getMother().toLowerCase().equals(searchTitle))
                peopleList.get(j).displayPeopleRecord();
        }

        if (peopleList.size() == 0)
            System.out.println("No matched result");
        
    }
    
    /**
     * Method to check insert any emptys or blank
     * 
     * @param iobuffer the iobuffer
     * @param subject the subject
     * @return the boolean of checkBlank
     */
    private boolean validBlank(String iobuffer,String subject) //method to check insert any empties or blanks
    {
        if (subject.equals("Option"))
        {
            //if iobuffer isEmpty or iobuffer.length() > 1 , Error : please insert from (1) to (5)! and return false to break if condition
            if (iobuffer.isEmpty() || iobuffer.length() > 1)
            {
                System.out.println("Error : please insert from (0) to (9)!");
                return false;
            }
            return true;
        }
        else
        {    
            //iobuffer.trim().isEmpty(), "Error: subject's name shouldn't be blank! Please enter the name again:" and return true to keep while condition
            if (iobuffer.trim().isEmpty())
            {
                System.out.println("Error: " + subject + " shouldn't be blank! Please enter the name again:");
                return true;
            }
        }
        return false;
    }

    /**
     * Method to check Delete selection is from 1 to size
     * 
     * @param index the index to be validated, the size the size
     * @return the boolean of checkDelSelection
     */
    private boolean validLimitSelection(int index, int size) //method to check int index
    {
        //check if rating is from 1 to size and return false to break while loop
        if (index < 0 || index > size)
        {
            System.out.println("Error : please insert from (1) to (" + size +")!");
            System.out.print("Please insert :");
            return true;
        }
        return false;
    }

    /**
     * Method to check People Name repeatation
     * 
     * @param peopleName the Name
     * @return the boolean of People Name repeatation
     */
    private boolean validPeopleName(String peopleName) //method to check People Name repeatation
    {
        //check if people name is not in database , and return false to break while loop
        //boolean isRepeated = newPeopleList.validPeopleName(peopleName);
        //if (isRepeated)
        //{
        //    System.out.println("Error : People name existed , please insert another People Name!");
        //    return isRepeated;
        //}
        return false;
    }

    /**
     * Method to check char option
     * 
     * @param option the option
     * @return the boolean of checkOption
     */
    private boolean validOption(char option) //method to check char option
    {
        //check if option is in 1,2,3,4,5,6 , and return false to break if condition , 6 for (HD)
        if (option < '0' || option > '9')
        {
            System.out.println("Error : please insert from (0) to (9)!");
            return false;
        }
        return true;        
    }

    /**
     * Method to check insert any space
     * 
     * @param iobuffer the iobuffer
     * @return the boolean of checkBlank
     */
    private boolean validSpace(String iobuffer) //method to check insert any space characters only on Children
    {
        //Children.charAt(0) == ' ', "Error: subject's name shouldn't be space only! Please enter the name again:" and return true to keep while condition
        if (iobuffer.isEmpty())
            return false;
        else if (iobuffer.charAt(0) == ' ')
        {
            System.out.println("Error: Children's name shouldn't be space only or start by space character! Please enter the name again:");
            return true;
        }
        return false;
    }

    
}

//Limitation

/*
- A dependent can be a friend ONLY to another dependent 
    - who is also younger than 16 and from a different family. 

- The age difference between these two young friends 
cannot be more than 3 years. 

- A person who is 
2 years old or younger does not have any friends. 

- For example 
a 4-year-old cannot be friend 
with a 2-year-old although their age difference is only 2.  
*/
