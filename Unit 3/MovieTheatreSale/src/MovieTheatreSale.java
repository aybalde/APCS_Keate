import java.util.*;

public class MovieTheatreSale {
  //instance variables
    private String movie;
    private String rating;
    private int time;
    private int totalTickets;
    private int adultTickets;
    public final double ADULT_TICKET_PRICE = 11.70;
    private int childTickets;
    public final double CHILD_TICKET_PRICE = 10.70;
    private int seniorTickets;
    public final double SENIOR_TICKET_PRICE = 11.20;
    private int matineeTickets;
    public final double MATINEE_TICKET_PRICE = 8.20;
    Scanner in = new Scanner(System.in);

    //constructor
    public MovieTheatreSale()
    {
        System.out.println("Movie: ");
        //Use the Scanner object in to read in the movie title and save it into the instance variable for it above.
        /*ToDo*/
        System.out.println("Rating: ");
        //Use the Scanner object in to read in the movie rating and save it into the instance variable for it above.
        /*ToDo*/
        rating = rating.trim();
        System.out.println("Showtime (in military time format, 2:00 pm is entered as 14:00): ");
        String timeIn = in.nextLine();
        timeIn = timeIn.trim();
        int colon = timeIn.indexOf(":");
        int timeHours = Integer.decode(timeIn.substring(0,colon));
        int timeMinutes = Integer.decode(timeIn.substring(colon+1));
        /*Calculate the time into the instance variable for it above. If the user entered 15:00, you should get 1500.
        The hours and minutes have already been saved in the 2 lines just above this.
         */
        /*ToDo*/
        /*Use an if - else statement check the time and determine if the show is a matinee showing (before 2:00pm).
        */
        if(/*ToDo*/) {
            System.out.println("Total number of tickets: ");
            //Use the Scanner object in to read in the total number of tickets and save it into the instance variable for it above.
            /*ToDo*/
            in.nextLine();
            //The total number of tickets should also be the value of the instance variable for total number of matinee tickets as this is the cheapest discount.
            /*ToDo*/
            /*The rest of the instance variables for the types of tickets should be set to zero (you will not need to ask the user how many of each
            type of these there are).*/
            /*ToDo*/
        }
        /*For any showing after 2:00pm, the number of matinee tickets should be set to zero and
        you will need to ask for the number of each type of ticket.*/
        else {
            //The instance variable for number of matinee tickets should be set to zero.
            /*ToDo*/
            System.out.println("Total number of tickets: ");
            //Use the Scanner object in to read in the total number of tickets and save it into the instance variable for it above.
            /*ToDo*/
            in.nextLine();
            System.out.println("Number of adult tickets: ");
            //Use the Scanner object in to read in the total number of adult tickets and save it into the instance variable for it above.
            /*ToDo*/
            in.nextLine();
            System.out.println("Number of child tickets: ");
            //Use the Scanner object in to read in the total number of child tickets and save it into the instance variable for it above.
            /*ToDo*/
            in.nextLine();
            System.out.println("Number of senior tickets: ");
            //Use the Scanner object in to read in the total number of senior tickets and save it into the instance variable for it above.
            /*ToDo*/
            in.nextLine();
            /*Check to see if the number of adult, children, and senior tickets add up to the total number of tickets
            If not, the output window should display that the number of tickets do not match and the program needs to be
            rerun. Then, exit the program. */
            if(/*ToDo*/) {
                System.out.println("Your number of number of adult, children, and senior tickets do not add up to the total number of " +
                        "tickets. Please start over.");
                System.exit(1);
            }
        }
    }

    //Do not change
    public MovieTheatreSale(String movie, String rating, int time, int totalTickets, int matineeTickets, int adultTickets, int childTickets, int seniorTickets)
    {
        this.movie = movie;
        this.rating = rating;
        this.time = time;
        this.totalTickets = totalTickets;
        this.matineeTickets = matineeTickets;
        this.adultTickets = adultTickets;
        this.childTickets = childTickets;
        this.seniorTickets = seniorTickets;
    }


    //getter methods: Please fill in the getter methods below.

    public String getMovie() { /*ToDo*/}

    public String getRating()
    {
        /*ToDo*/
    }

    public int getShowtime()
    {
        /*ToDo*/
    }

    public int getTotalTickets()
    {
        /*ToDo*/
    }

    public int getMatineeTickets()
    {
        /*ToDo*/
    }

    public int getAdultTickets()
    {
        /*ToDo*/
    }

    public int getChildTickets()
    {
        /*ToDo*/
    }

    public int getSeniorTickets()
    {
        /*ToDo*/
    }

    //mutator methods

    /*Create a method, checkID, that records the customer's ID age is valid if the movie is rated R.
    The user should be asked to enter the birth year on the ID to test if the ID is valid.
    This method should return a boolean.
     */
    public boolean checkID()
    {
        System.out.println("Check ID (enter birth year): ");
        //Use the Scanner object in to read in the birth year and save it into the variable birthYear below.
        int birthYear = /*ToDo*/;
        in.nextLine();
        if(/*ToDo*/)
            return /*ToDo*/;
        else
            return /*ToDo*/;
    }

    /*Write a method, getTotalSale, to calculate and return the total sale for tickets for a customer.
    The sale should account for appropriate discounts when necessary.*/
    public double getTotalSale()
    {
        /*ToDo*/
    }

    //Do not change
    public String toString()
    {
        return ("Movie: " + movie + "\nRating: " + rating + "\nShowtime: " + time + "\nTotal Tickets: " + totalTickets +
                 "\nMatineeTickets: " + matineeTickets + "\nAdult Tickets: " + adultTickets + "\nChild Tickets: " + childTickets +
                "\nSenior Tickets: " + seniorTickets + "\nTotal Price: " + getTotalSale());
    }

}