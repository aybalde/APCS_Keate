import java.util.Scanner;

public class TicTacToe
{
    private String player1 = "x";
    private String player2 = "o";
    private boolean player1Turn;
    private boolean win;
    private boolean boardFull;
    private String[][] board = new String/*ToDo*/;
    private Scanner in = new Scanner(System.in);

    /* Constructor
     Postcondition: player1Turn is randomly assigned a true or false value.
             win and boardFull are both assigned to false.
             Instance array board is filled with spaces to begin the game. */
    public TicTacToe()
    {
        /*ToDo*/
    }
    /* Constructor
     Postcondition: player1Turn is randomly assigned a true or false value.
             win and boardFull are both assigned to false.
             Instance array board is assigned to the parameter board. */
    public TicTacToe(String[][] board)
    {
        /*ToDo*/

    }
    /* Precondition: board is filled with only x’s, o’s, and spaces dependant on what the users
     have entered.
     Postcondition: board is displayed in the console window. All of the elements
     are printed with the character “|” before and after the rows, and
     and between each one. board is unchanged.*/
    private void display()
    {
        /*ToDo*/
    }
    /*Postcondition: If player1Turn holds true before the call to switchTurns, it will hold false after the call.
      If player1Turn holds false before the call to switchTurns, it will hold true after the call.
      board is unchanged.*/
    private void switchTurns()
    {
        /*ToDo*/
    }

    /* Precondition: board is filled with only x’s, o’s, and spaces dependant on what the users
     have entered.
     Postcondition: If a horizontal row holds all x's, then the String variable player1 (which holds x) will be returned.
      If a horizontal row holds all o's, then the String variable player2 (which holds o) will be returned. For both cases,
      win is set to true. Otherwise, null is returned.
      board is unchanged.*/
    public String horizontalWinner()
    {
        /*ToDo*/
    }

    /* Precondition: board is filled with only x’s, o’s, and spaces dependant on what the users
     have entered.
     Postcondition: If a vertical column holds all x's, then the String variable player1 (which holds x) will be returned.
      If a vertical column holds all o's, then the String variable player2 (which holds o) will be returned. For both cases,
      win is set to true. Otherwise, null is returned.
      board is unchanged.*/
    public String verticalWinner()
    {
        /*ToDo*/
    }

    /* Precondition: board is filled with only x’s, o’s, and spaces dependant on what the users
     have entered.
     Postcondition: If a diagonal holds all x's, then the String variable player1 (which holds x) will be returned.
      If a diagonal holds all o's, then the String variable player2 (which holds o) will be returned. For both cases,
      win is set to true. Otherwise, null is returned.
      board is unchanged.*/
    public String diagonalWinner()
    {
        /*ToDo*/
    }

    /* Precondition: board is filled with x’s and o’s dependant on what the users
    have entered.
    Postcondition: If a call to horizontalWinner, verticalWinner, or diagonalWinner does not return null, a statement is returned to notify
    the users who won in the format: "[insert winner] wins!"
    If board is completely full of x’s and o’s but there is no winner as
    defined above, the statement, "Tie game! Rerun to play again!" is returned and boardFull is set to true.
    If the board is not full and there is no winner, null is returned.
    board is unchanged.*/
    public String findWinner()
    {
        /*ToDo*/
    }

    /*If there is winner or the board is full, the method will direct for a specific message indicating
     either the winner or a tie to be printed. The method will direct the player whose turn it is to indicate a spot
     to fill. If the spot is taken, the method will print a message to the user indicating that the spot is full and will
     continue asking for a valid space until one is entered. Once a valid space is entered, the spot will be filled
     with an x for player1 or a an o for player2. The board will be displayed, the players will switch turns, and a check will
     be done to see if there is a winner or a tie.
     Precondition: board is filled with only x’s, o’s, and spaces dependant on what the users
     have entered.
     Postcondition: A valid space will be filled in the array for the player whose turn it is. If it is player1's turn, x
      will be filled in the chosen, valid space. If it is player2's turn, o will be filled in the chosen, valid space.
      The board will be displayed, the turn will be switched, and if there is a tie or a winner, an appropriate message will be printed and the program
      will exit.*/
    private void turn()
    {
        if(win == true)
            findWinner();
        if(boardFull == true)
            findWinner();
        boolean spotIsFull = false;
        if(player1Turn == true)
        {
            while(!spotIsFull)
            {
                System.out.println("X's turn! Enter the row for your play (1 - 3): ");
                int row = in.nextInt();
                in.nextLine();
                System.out.println("X's turn! Enter the column for your play (1 - 3): ");
                int col = in.nextInt();
                in.nextLine();
                if(row >= 1 && row <= 3 && col >= 1 && col <= 3)
                {
                    if (board[row - 1][col - 1].equals(" "))
                    {
                        board[row - 1][col - 1] = player1;
                        spotIsFull = true;
                    } else
                        System.out.println("You have chosen a space that is already filled.  Please try again!");
                }
                else
                    System.out.println("You have chosen an invalid space.  Please enter only 1, 2, or 3!");
            }

        }
        else
        {
            while(!spotIsFull)
            {
                System.out.println("O's turn! Enter the row for your play (1 - 3): ");
                int row = in.nextInt();
                in.nextLine();
                System.out.println("O's turn! Enter the column for your play (1 - 3): ");
                int col = in.nextInt();
                in.nextLine();
                if(row >= 1 && row <= 3 && col >= 1 && col <= 3)
                {
                    if (board[row - 1][col - 1].equals(" "))
                    {
                        board[row - 1][col - 1] = player2;
                        spotIsFull = true;
                    } else
                        System.out.println("You have chosen a space that is already filled. Please try again!");
                }
                else
                    System.out.println("You have chosen an invalid space.  Please enter only 1, 2, or 3!");
            }
        }
        display();
        switchTurns();
        if(findWinner() != null)
        {
            System.out.println(findWinner());
            System.exit(0);
        }
    }

    /* Precondition: board is filled with only x’s, o’s, and spaces dependant on what the users
     have entered.
     Postcondition: If win or boardFull is false, the method turn() continues to be called. If either are true, the program is
       exited.*/
    public void playGame()
    {
        while(!win && !boardFull)
            turn();
        System.exit(-1);
    }

}
