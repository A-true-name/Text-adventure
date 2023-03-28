
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
    //private String[] rooms  
    /** Starting the game.
     *  Have fun.
     *  
     *  
     *  
     *  
     */ 

    public Text_game()
    {
        String goal,Instructions;//Strings
        goal= "Your goal is to collect 3 items so you can leave the building"; //The goal of the game
        Instructions = "The controlls are West,North,South,East,Down,Up,Look/examine room";
        boolean look;
        look = false;
        
        //Instructions = "The controlls are West,North,South,East,Down,Up,Look/examine room";
        Scanner looking = new Scanner(System.in);
        System.out.println("Controlls to the game are West,North,South,East,Down,Up");
        
        //goal= "Your goal is to collect 3 items so you can leave the building"; //The goal of the game
        System.out.print(goal); //Prints out the goal string.
        int[] rooms = new int[8];//Array for rooms
        rooms[1]=2;
        rooms[2]=2;
        
        
        if (look = true){// Hmmm 
            System.out.println("look is true");// For checking if it is working
        
        
        
        
        }
    }
}
