
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
        int North []= {0,0,0,0,0};
        int West []= {0,0,0,0,0};
        int East []= {0,0,0,0,0};
        int South []= {0,0,0,0,0};
        int Up []= {0,0,0,0,0};
        int Down []= {0,0,0,0,0};
        //goal= "Your goal is to collect 3 items so you can leave the building"; //The goal of the game
        System.out.print(goal); //Prints out the goal string.
        int[] room = new int[8];//Array for rooms
        room[0]=0;
        room[1]=1;
        room[2]=2;
        room[3]=3;
        room[4]=4;
        room[5]=5;
        room[6]=6;
        room[7]=7;
        
        if (look = true){// Hmmm 
            
            System.out.println("look is true");// For checking if it is working
        
        
        
        
        }
    }
}
