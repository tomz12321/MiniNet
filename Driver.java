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
    private MiniNet newMiniNet;

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        //initialise the variables

        newMiniNet = new MiniNet();
    }
 

    /**
     * A method to add movie to the database system
     * 
     * @param
     * @return 
     */
    private void addPeople()
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
            newMovieName = input.nextLine();
            //valid addPeopleName if existed , Error message
            while (validPeopleName(newPeopleName))
                newPeopleName = input.nextLine(); 
        }        
        System.out.println("Please insert people age :");

        //input people age
        String newPeopleAge = input.nextLine();

        while (validBlank(newDirectorName,"People Age"))
            newPeopleAge = input.nextLine();

        System.out.println("Please insert Father name :");

        //input Father's name
        String newFatherName = input.nextLine();

        while (validBlank(newFatherName,"Father Name"))
            newFatherName = input.nextLine();

        System.out.println("Please insert Mother name :");
        //input Mother's name
        String newMotherName = input.nextLine();

        while (validBlank(newMotherName),"Mother Name")
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
        ListOfParent newParentList = new ListOfParent();
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
        newPeople.setFatherName(elements[0]);
        newPeople.setMotherName(elements[1]);
        newPeople.setChildrenName(elements[2]);

        //newPeople.setParentList(newActorList.getListOfActors());
        
        //outprint to testing
        newPeople.displayPeopleRecord();

        //add to People List
        newPeopleList.addPeople(newPeople);
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
     * A method to delete movie from the database system
     * if there are above two movies appearing on the search result
     * provide choosing options
     * 
     * @param
     * @return 
     */
    private void deletePeople()
    {
        System.out.println("Delete People :");        
        //input
        Scanner input = new Scanner(System.in);

        //search by title
        System.out.println("=== Search People to delete : ===");
        System.out.println("Search People , please insert keyword of name:");

        String delKeyword = input.nextLine().toLowerCase();

        while (validBlank(delKeyword,"Name keyword"))
            delKeyword = input.nextLine().toLowerCase();

        ArrayList<People> delResultList = newPeopleList.searchPeople(delKeyword);

        //display Movie details
        System.out.println("Search Result");
        for (int j = 0 ; j < delResultList.size() ; j++)
        {
            System.out.print( (j + 1) + ") ");
            delResultList.get(j).displayPeopleRecord();
        }

        int size = delResultList.size();

        //selection
        if (size != 0)
        {
            System.out.println("Please insert which option number you would select to delete, press 0 to quit :");
            String delPeopleSelection = input.nextLine();
            int index = convertStringtoInt(delPeopleSelection);

            if (index == 0)
                size = 0;
            //validDelSelection (index, delresultList.size());
            while (validDelSelection (index, size))
            {

                delMovieSelection = input.nextLine();
                index = convertStringtoInt(delPeopleSelection);
                if (index == 0)
                    size = 0;
                while (validBlank(delMovieSelection,"Selection"))
                {    
                    delMovieSelection = input.nextLine();
                    index = convertStringtoInt(delPeopleSelection);
                    if (index == 0)
                        size = 0;
                }
            }
            System.out.println(delPeopleSelection);

            String delPeopleName;

            if (size != 0)
                delPeopleName = delResultList.get(index -1).getName();
            else
                delPeopleName = "";

            //System.out.println("Delete Movie , please insert delete title:");
            //String delMovieName = input.nextLine();
            newPeopleList.deletePeople(delPeopleName);
        }
        else
            System.out.println("No matched people");
    }

    
    /**
     * A method to display Menu
     * 
     * @param
     * @return 
     */

    private void displayMenu()
    {
        //interface
        System.out.println("");
        System.out.println("=====================");
        System.out.println("(1) Search movies");
        System.out.println("(2) Add Movie");
        System.out.println("(3) Delete Movie");
        System.out.println("(4) Display Favourite Movies");
        System.out.println("(5) Edit Movie (Actors and Rating)");
        System.out.println("(6) Exit System");
        System.out.print("Choose an option :");
    }

    /**
     * A method to edit people from the database system
     * if there are above two people appearing on the search result
     * provide choosing options
     * 
     * @param
     * @return 
     */
    private void editPeople()
    {
        System.out.println("Edit People :");        
        //input
        Scanner input = new Scanner(System.in);

        //search by title
        System.out.println("=== Search People to edit : ===");
        System.out.println("Search People , please insert keyword of Name:");

        String editKeyword = input.nextLine().toLowerCase();

        while (validBlank(editKeyword,"Name keyword"))
            editKeyword = input.nextLine().toLowerCase();

        ArrayList<People> editResultList = newPeopleList.searchPeople(editKeyword);

        //display People details
        System.out.println("Search Result");
        for (int j = 0 ; j < editResultList.size() ; j++)
        {
            System.out.print( (j + 1) + ") ");
            editResultList.get(j).displayPeopleRecord();
        }

        int size = editResultList.size();

        //selection
        if (size != 0)
        {
            System.out.println("Please insert which option number you would select to delete, press 0 to quit :");
            String editPeopleSelection = input.nextLine();
            int index = convertStringtoInt(editPeopleSelection);

            if (index == 0)
                size = 0;
            //validDelSelection (index, delresultList.size());
            while (validDelSelection (index, size))
            {

                editPeopleSelection = input.nextLine();
                index = convertStringtoInt(editPeopleSelection);
                if (index == 0)
                    size = 0;
                while (validBlank(editPeopleSelection,"Selection"))
                {    
                    editPeopleSelection = input.nextLine();
                    index = convertStringtoInt(editPeopleSelection);
                    if (index == 0)
                        size = 0;
                }
            }
            System.out.println(editPeopleSelection);

            String editPeopleName;

            if (size != 0)
                editPeopleName = editResultList.get(index - 1).getName();
            else
                editPeopleName = "";

            if (size !=0)
            {
                System.out.println("==== Edit People ====");

                System.out.println("Please insert people age :");        
                //input people's age
                String newPeopleAge = input.nextLine();

                while (validBlank(newPeopleAge,"people age"))
                    newPeopleAge = input.nextLine();
               
            }
        }
        else
            System.out.println("No matched people");
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
        newPeopleList = new MiniNet();

        return false;
    }

    /**
     * A method to read from file (Debug)
     * 
     * @param  
     * @return
     * @throws FileNotFoundException if file is not found
     * @throws IOException while exception during I/O actions
     */
    private void readFile()
    {
        String filename = ("myvideos.txt");
        String videos;
        People loadFromFile;
        // try catch to handle FileNotFoundException and IOException
        try
        {
            FileReader inputFile = new FileReader(filename);
            Scanner parser = new Scanner(inputFile);
            int linecount = 0;
            while (parser.hasNextLine())
            {
                loadFromFile = new People(); 
                videos = parser.nextLine();
                String[] attribute = videos.split(",");

                for (int i = 0 ; i < attribute.length ; i++)
                {
                   System.out.println (attribute[i]);
                
                   //numbers of Movies
                   //for (int k = 0 ; k < loadFromFile.getNumbersOfElements() ; k++)
                   //{
                   //attributes of Movies
                   //}
                }

                System.out.println ("People"+ linecount);
                loadFromFile.setName(attribute[0]);
                loadFromFile.setAge(attribute[1]);
                
                //add people to the list
                People newPeople = new People(); 
                ListOfActors newActorList = new ListOfActors();
                //handle String
                ArrayList<String> loadFromFileParentStringList = new ArrayList<String>();
                
                //for loop to handle attribute[2] - attribute[4] 
                for (int i = 0 ; i < (attribute.length - 3) ; i++) 
                {
                    loadFromFileActorStringList.add(attribute[ i + 2 ]);
                    //String newActor2Name = attribute[3];
                    //String newActor3Name = attribute[4];
                }
               
                //actor list (using for loop to handle it)
                ArrayList<People> loadFromFileParentList = new ArrayList<People>();
                for (int i = 0 ; i < loadFromFileParentList.size() ; i++)
                {
                    People people = new People();
                    //using loadFromFileActorStringList.get(i) to replace newActorName
                    people.setName(loadFromFileActorStringList.get(i)); 
                    loadFromFileParentList.add(People);
                }
                //loadFromFile.cleanListOfPeople();
                //
                loadFromFile.setActorList(loadFromFileActorList);                               
                                
                //loadFromFile.displayPeopleRecord();
                loadFromFile.displayPeopleRecord();
                newPeopleList.addPeople(loadFromFile);
                linecount++;
                System.out.println ("=====================");
            }
            inputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(filename + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     * A method to select search by movie title or movie director
     * 
     * @param
     * @return
     */
    private void searchCase() //validBlank and validDelSelection to valid case option are between (1) and (2)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Press (1) To search by Movie Title or (2) To search by Movie Director");        
        String iobuffer = input.nextLine();
        char option = ' '; 

        while(validBlank(iobuffer.trim(),"Options"))
            iobuffer = input.nextLine();

        while(validDelSelection(convertStringtoInt(iobuffer.trim()), 2))
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
            //search Movie from the list
            searchMovie();
            break;

            case '2':
            //search Movie from the list by director
            searchByDirector();
            break;                                
        }
    }

    /**
     * A method to search movie
     * 
     * @param
     * @return 
     */
    private void searchPeople() //not case-sensitive source.toLowerCase().contains(target.toLowerCase())
    {
        System.out.println("=== Search People ===");
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Search People , please insert a keyword to search by name:");
        String newPeopleName = input.nextLine().toLowerCase();

        while(validBlank(newPeopleName,"People Name"))
            newPeopleName = input.nextLine().toLowerCase();

        //searchMovie()
        ArrayList<People> resultList = newPeopleList.searchMovie(newPeopleName);

        //display Movie details
        System.out.println("Search Result");
        for (int j = 0 ; j < resultList.size() ; j++)
        {
            resultList.get(j).displayPeopleRecord();
        }

        if (resultList.size() == 0)
            System.out.println("No matched result");
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

                //if option not in 1,2,3,4,5 Error message: please insert from (1) to (5)!
                if (validOption(option))
                {
                    switch (option)
                    {
                        case '1':
                        //searchCase();
                        System.out.println("Case 1");
                        break;
                        case '2':
                        //add Movie to the list
                        //addMovie();
                        System.out.println("Case 2");
                        break;
                        case '3':
                        //delete Movie from the list
                        //deleteMovie();
                        System.out.println("Case 3");
                        break;
                        case '4':
                        //display Favourate Movie
                        //displayFavourateMovie();
                        System.out.println("Case 4");    
                        break;
                        case '5':
                        //Edit Movie from the list (Actors and Rating) (HD)
                        //editMovie();
                        System.out.println("Case 5");
                        break;
                        case '6':
                        //Exit system, and reset variables
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
                System.out.println("Error : please insert from (1) to (6)!");
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
    private boolean validDelSelection(int index, int size) //method to check int index
    {
        //check if rating is from 1 to size  and return false to break while loop
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
        //check if movie title is not in database , and return false to break while loop
        boolean isRepeated = newPeopleList.validPeopleName(peopleName);
        if (isRepeated)
        {
            System.out.println("Error : People name existed , please insert another People Name!");
            return isRepeated;
        }
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
        if (option < '1' || option > '6')
        {
            System.out.println("Error : please insert from (1) to (6)!");
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

    /**
     * A method to write to file
     * 
     * @param  
     * @return
     * @throws IOException while exception during I/O actions
     */
    private void writeFile()
    {
        String filename = ("myvideos.txt");
        //use movie.getNumbersOfElement() to replace 6
        String[] videos = new String[6];
        Scanner input = new Scanner(System.in);
        String line = "";
        int numberOfVideos;
        MovieDatabase toWriteMovieList = new MovieDatabase();
        
        //print the result of inserting
        System.out.println("How many movies your want to insert :");
        //numberOfVideos = convertStringtoInt(input.nextLine());
        numberOfVideos = newMovieList.getNumbersOfMovies();
        System.out.println(numberOfVideos + "");
        //try catch to handle IOException
        try
        {
            PrintWriter outputFile = new PrintWriter (filename);

            for (int i = 0 ; i < numberOfVideos ; i++ )
            {
                //System.out.println("Please insert Videos " + (i + 1) + "'s Title :");
                videos[0] = newMovieList.getMovieList().get(i).getTitle();
                //System.out.println("Please insert Videos" + (i + 1) + "'s Director :");
                videos[1]  = newMovieList.getMovieList().get(i).getDirector();

                //for loop to replace 2,3,4
                for (int j = 2 ; j < newMovieList.getMovieList().get(i).getActorList().getNumbersOfActors() + 2 ; j++ )
                {
                    //videos[index] = newMovieList.getMovieList().get(i).getActorList().getListOfActors().get(j - 2).getName()
                    videos[j]  = newMovieList.getMovieList().get(i).getActorList().getListOfActors().get(j - 2).getName();
                }

                videos[newMovieList.getMovieList().get(i).getNumbersOfElements() - 1]  = newMovieList.getMovieList().get(i).getRating() + "";

                //combine elements into a line
                for (int k = 0 ; k < newMovieList.getMovieList().get(i).getNumbersOfElements() ; k++ )
                {   
                    //line = videos[0] + "," + videos[1] + "," + videos[2] + "," + videos[3] + "," + videos[4] + "," + videos[5];
                    if (k != (newMovieList.getMovieList().get(i).getNumbersOfElements() - 1))
                        line = line + videos[k] + ",";
                    else
                        line = line + videos[k];
                }
                //display a message about write line
                System.out.println("");
                System.out.println("Write a message in line to a file");
                System.out.println("");

                outputFile.println(line);
                //reset line
                line = "";
            }
            outputFile.close();    
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }
}
    //Method ! Add a person into the network -> add()
    
    //! Select a person by name -> select()
    
    //! Display the profile of the selected person -> display()
    
    //! Update the profile information of the selected person -> update()
    
    //! Delete the selected person -> delete()
    
    //! Connect two persons in a meaningful way e.g. friend, parent -> connect()
    
    //! Find out whether a person is a direct friend of another person ->
    
    //! Find out the name(s) of a person’s child(ren) or the names of the parents
}
