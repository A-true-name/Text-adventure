
/**
 * Write a description of class Text_game here.
 *
 * @author (Hamish Kaufman)
 * @version (28/03/2023)
 */
//Imports
import java.util.Scanner; //To be able to use scanners.

public class Text_game
{
    // instance variables - replace the example below with your own
    private int x;
    /** System.out.print("West")
     *  System.out.print("North")
     *  System.out.print("South")
     *  System.out.print("East")
     *  System.out.print("Down")
     *  System.out.print("Up")
     */ 

    public Text_game()
    {
        String goal,Instructions;//Strings
        goal= "Your goal is to collect 3 items so you can leave the building"; //The goal of the game
        Instructions = "The controlls are West,North,South,East,Down,Up,Look/examine room";
        Scanner look = new Scanner(System.in);
        System.out.println("Controlls to the game are ");
        
        goal= "Your goal is to collect 3 items so you can leave the building"; //The goal of the game
        System.out.print("Your goal is to"+goal); //Prints out the goal string and the coded text within this line in the brackets.
        int[] rooms = new int[8];//
        
        
        
        

    }


}
